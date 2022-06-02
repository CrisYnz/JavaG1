package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		// Funciones
		// 4 tipos de funciones
		// 2 que retornan
		// 2 que no retornan
		// funciones que reciben y no reciben parametros
		// nombre_funcion se escribe con minuscula la priemera letra siempre
		// no se puede CREAR un metodo dentro de otro metodo, si puede llamar a otro metodo
		saludo();
		calculoSumaPares(true, 23, "33", 44l, "Suma");
		int edad = obtenerEdad();
		System.out.println(edad);
		
		boolean mayorOMenor = validarMayorEdad(edad);
		
		if (mayorOMenor) {
			System.out.println("Puede ingresar al curso");
		} else {
			System.out.println("No puede ingresar al curso");
			
		}
	}

	// accesador publico, nos permite acceder de cualquier parte, cualquier otra
	// clase lo podra invocar/llamar
	// private
	// protected
	// accesador tipo_de_retorno nombre_funcion (parametros_a_recibir)
	// static nos permite acceder al metodo sin instanciar la funcion
	// Las funciones de tipo void no retornan nada, solo ejecutan código

	public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
		Integer num2 = Integer.parseInt(numero2);
		System.out.println(numero1 + numero3 + num2 );
	}

	// funcion sin parametros
	
	public static void saludo() {
		//solicitar el ingreso de datos
		System.out.println("Buenos dias");
	}
	// funciones que retornan un tipo de datos
	public static Integer obtenerEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = sc.nextInt();

		return edad;
	}

	public static Boolean validarMayorEdad(Integer edad) {

		if (edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		} else {
			System.out.println("Es mayor de edad");
			return false;
		}

	}
}
