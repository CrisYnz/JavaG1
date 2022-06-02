package com.generation.f20220523;

import java.util.Iterator;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaracion de variables

		int cantidadNotas = 12;
		Integer[] notas = { 20, 50, 67, 99, 10, 0, 88, 77, 58, 79, 33, 50 };

		// promedio-> suma todas las notas/ cantidad de notas
		int sumaNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		}
		System.out.println("suma de notas " + sumaNotas);

		float promedio = sumaNotas / notas.length;

		if (promedio >= 50 && promedio <= 100) {

		} else {

		}

	}
}