package com.generation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	
	//inyeccion de dependencias
	
	@Autowired
	UsuarioService usuarioService;
	
	
	// ruta para desplegar el jsp en registro
	// Con Usuario usuario pasamos un objeto vacio
	@RequestMapping("")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {
		return "registro.jsp";// pagina a desplegar
	}

	// ruta para formulario registro usuario
	// PostMapping es seguro, solo acepta metodos post
	@PostMapping("/usuario/respaldo")
	public String registroUsuario(@RequestParam(value = "nombre") String nombre,
			@RequestParam(value = "apellido") String apellido, @RequestParam(value = "edad") int edad) {
		System.out.println("Nombre " + nombre + "\n" + "Apellido " + apellido + "\n" + "Edad " + edad);
		return "registro.jsp";// pagina a desplegar
	}

	@PostMapping("/usuario")
	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult resultado,
			Model model) {
		// capturamos si existe un ingreso de error en los datos
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Debe realizar el ingreso de datos");
			return "registro.jsp";
		}
		// capturamos el objeto usuario con atributos llenos
		System.out.println(usuario.toString());

		// enviar el objeto al service
		usuarioService.saveUsuario(usuario);
		
		
		return "index.jsp";// pagina a desplegar
	}

}
