package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);
		
		//assertEquals(valorEsperado, Respuesta/Resultado);
		assertEquals(54, resultado);
	}

}
