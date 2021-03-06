package com.generation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@Controller
@RequestMapping("/auto")
public class AutoController {

	// inyeccion de dependencias

	@Autowired
	AutoService autoService;

	// Pasamos un objeto vacio
	@RequestMapping("")
	public String auto(@ModelAttribute("auto") Auto auto) {
		return "auto.jsp";
	}

	@PostMapping("/guardar")
	public String guardarAuto(@ModelAttribute("auto") Auto auto, BindingResult resultado, Model model) {
		// capturamos si existe un ingreso de error en los datos
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Debe realizar el ingreso de datos");
			return "auto.jsp";
		} else {
			// capturamos el objeto auto con atributos llenos
			System.out.println(auto.toString());

			// enviar el objeto al service
			autoService.saveAuto(auto);
			// obtener una lista de autos
			List<Auto> listaAutos = autoService.findAll();
			// pasamos la lista de autos al jsp
			model.addAttribute("autosCapturados", listaAutos);
			return "mostrarAutos.jsp";// pagina a desplegar

		}

	}

	// mostrar el listado de autos
	@RequestMapping("/mostrar")
	public String mostrar(Model model) {
		// obtener una lista de autos
		List<Auto> listaAutos = autoService.findAll();
		// pasamos la lista de autos al jsp
		model.addAttribute("autosCapturados", listaAutos);
		return "mostrarAutos.jsp";
	}
	
	@RequestMapping("/editar/{id}")//editar para despliegue de todos los autos
	public String editar(@PathVariable("id") Long id, Model model) {
		System.out.println("el id es:" + id);
		Auto auto = autoService.buscarId(id);
		model.addAttribute("auto",auto);
		return "editarAuto.jsp";//redireccionar a otra url
	}
	
	//localhost:9080/auto/actualizar/{id} -> actualizar para la persistencia en BD
	@PostMapping("editar/actualizar/{id}")
	public String actualizarAuto(@PathVariable("id") Long id ,@Valid @ModelAttribute("auto") Auto auto, BindingResult resultado, Model model) {
		System.out.println("EL id a actualizar es:" + id);
		// capturamos si existe un ingreso de error en los datos
		
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Debe realizar el ingreso de datos");
			return "editarAuto.jsp";
		} else {
			// capturamos el objeto auto con atributos llenos
			System.out.println(auto.toString());

			// enviar el objeto al service
			autoService.saveAuto(auto);
			return "redirect:/auto/mostrar";

		}

	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarAuto(@PathVariable("id") Long id) {
		autoService.eliminarPorId(id);
		
		return "redirect:/auto/mostrar";
	}
}
