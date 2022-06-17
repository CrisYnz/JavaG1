package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrutamientoRestController {
	/* Enrutamientos */
	//http://localhost:8080
	@RequestMapping("/usuario")
	public String usuario(){
		  return "estamos en la url usuario";	
		}
	
	@RequestMapping("/usuario/inscrito")
	public String inscrito(){
		  return "estamos en la url usuario/inscrito";	
		}
	
	@RequestMapping("/cliente/registrado")
	public String cliente(){
		  return "estamos en la url cliente/registrado";	
		}
	
	@RequestMapping( value= "/proveedor/registrado", method = RequestMethod.GET)
	public String proveedor(){
		  return "estamos en la url proveedor/registrado";	
		}
}
