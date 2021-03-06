package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") // localhost:8080/var -> Path por default
public class PathVariableRestController {
	/* capturar variable desde la ruta o path con @PathVariable*/
	//localhost:8080/var/anio/2023/mes/6/dia/13
	@RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
	public String capturarVariablesPath(@PathVariable("a")String anio,
										@PathVariable("m") String mes,
										@PathVariable("d") String dia)
	{
		return "le fecha es: " + anio+ "/" + mes + "/" + dia;
	}
	
	//localhost:8080/var/fecha/{anio}/{mes}/{dia}
	@RequestMapping("fecha/{a}/{m}/{d}")
	public String capturarVariablesPathCorto(@PathVariable("a")String anio,
										@PathVariable("m") String mes,
										@PathVariable("d") String dia)
	{
		return "le fecha es: " + anio+ "/" + mes + "/" + dia;
	}
}
