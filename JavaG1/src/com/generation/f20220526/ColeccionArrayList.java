package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		// ArrayList Dinamicos
		// Instancia de clase
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();

		// Agrega un elementoa la lista
		colores.add("rojo");
		colores.add("azul");

		// si existe un elemento en la posicion lo desplaza a la derecha
		colores.add("BLANCO");

		System.out.println(colores);

		// acceder a un elemento
		System.out.println(colores.get(1));

		// tamaño del arreglo
		System.out.println(colores.size());

		// modificar un elemento
		colores.set(1, "Negro");

		System.out.println(colores);

		// recorrer el arreglo
		for (int i = 0; i < colores.size(); i++) {
				System.out.println(colores.get(i));
		}
		System.out.println("*****************");
		for (String color : colores) {
			System.out.println(color);
		}
		
		//ordena el arreglo de forma ascendente
		Collections.sort(colores);
		System.out.println(colores);
		// quitar elemento
		colores.remove(2);
		System.out.println(colores);

		// quitar todos los arreglos
		colores.clear();
		System.out.println(colores);
		
		numerosPares.add(4);
		numerosPares.add(2);
		numerosPares.add(14);
		numerosPares.add(20);
		numerosPares.add(16);
		numerosPares.add(8);
		
		System.out.print(numerosPares+" ");
		System.out.println();
		Collections.sort(numerosPares);
		System.out.println(numerosPares+" ");
		Collections.reverse(numerosPares);
		System.out.println(numerosPares+" ");
	}

}
