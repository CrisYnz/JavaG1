package com.generation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@RestController
@RequestMapping("/api")
public class ApiRestController {
	
	@Autowired //inyeccion de dependencia de la clase
	AutoService autoService;
	
	@RequestMapping("/obtener/autos")
	public List<Auto> obtenerListaAutos(){
		List<Auto> listaAutos = autoService.findAll();
		return listaAutos;
	}
	
	//API (JSON)
}
