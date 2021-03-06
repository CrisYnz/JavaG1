package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);
		
		//assertEquals(valorEsperado, Respuesta/Resultado);
		assertEquals(54, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		int resultado = calc.resta(12, 42);
		
		//assertEquals(valorEsperado, Respuesta/Resultado);
		assertEquals(-30, resultado);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicacion(12, 42);
		
		//assertEquals(valorEsperado, Respuesta/Resultado);
		assertEquals(504, resultado);
	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(12, 42);
		
		//assertEquals(valorEsperado, Respuesta/Resultado);
		assertEquals("0", resultado);
	}
	
@Test
	
	void testEsPar() {
		Calculadora calc = new Calculadora();
	
		boolean resultado = calc.esPar(4);
		assertTrue(resultado); // Validar que resultado sea true
		assertNotNull(resultado); //Validar que resultado no sea Null
		assertNotSame(false, resultado); //Validar que argumentos sean distintos
		
	}
	
	
	@Test
	void testEsImpar() {
		Calculadora calc = new Calculadora();
		boolean resultado = calc.esImpar(6); 
		assertFalse(resultado); //Validar que resultado sea Falso
	}

}
