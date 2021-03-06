package com.generation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Usuario;

@Controller
public class IndexControlller {
 //http://localhost:8080
	@RequestMapping("/")//anotacion para capturar las rutas
	public String index(Model model) {
		model.addAttribute("apellidos", "Yáñez Barraza");
		model.addAttribute("nombres", "Cristian Andres");
		model.addAttribute("apodos", "Cris o Andy");
		model.addAttribute("edad", 26);
		//instancia de usuario
		Usuario usuario = new Usuario("Cristian", "Yañez", "Cris/Andy", 26, "pass123");
		//pasando el objeto a la vista (JSP)
		model.addAttribute("usuario", usuario);
		return "index.jsp";
	}
	
}
