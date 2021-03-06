package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")//Establecer nombre de ruta por defecto
public class ParametrosRestController {
	// localhost:9080/api/fecha?fecha=20220613
	@RequestMapping("/fecha")
	public String fecha(@RequestParam(value = "fecha") String fecha) {
		return "la fecha es: " + fecha;
	}

	// localhost:9080/api/nombre?nombre=20220613
	@RequestMapping("/nombre")
	public String nombre(@RequestParam(value = "nombre") String nombre) {
		return "su nombre es: " + nombre;
	}

	// localhost:9080/api/seccion?modulo=3&seccion=5
	@RequestMapping("/seccion")
	public String nombre(@RequestParam(value = "modulo") String modulo,
			@RequestParam(value = "seccion") String seccion) {
		return "el modulo es: " + modulo + "la seccion es: " + seccion;
	}

	// localhost:9080/api/date?anio=2022&mes=6&dia=13
	@RequestMapping("/date")
	public String capturarParametros(@RequestParam(value = "anio", required = false) String anio,
			@RequestParam(value = "mes", required = false) String mes,
			@RequestParam(value = "dia", required = false) String dia) {
		
		if (anio != null) {
			System.out.println("El año es " + anio);
		}
		
		if (mes != null) {
			System.out.println("El mes es " + mes);
		}
		if (dia != null) {
			System.out.println("El dia es " + dia);
		}
		return "La fecha es: " + anio + mes + dia;
	}
}
