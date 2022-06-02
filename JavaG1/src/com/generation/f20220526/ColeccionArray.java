package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array ESTATICOS
		String[] colores = {"red","blue","yellow","orange","black"};
		Integer[] numerosPares= {2,4,6,8,10,12};
		int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,9,0};
		
		//posicion inicial es cero
		System.out.println(colores[0]);
		System.out.println(numerosPares[0]);
		System.out.println(primerosNumeros[0]);
		
		//nombreArray -> accediendo al elemento del arreglo en esa posicion
		System.out.println(numerosPares[3]); 
		
		numerosPares[3] = 14;//modificando el elemento en esa posicion
		System.out.println();
		
		//numerosPares[6] = 14; //Error fuera de indice, ya que la ultima posicion es 5
		
		System.out.println("tamaño array colores: " + colores.length);
		System.out.println("tamaño array numeros pares: " + numerosPares.length);
		System.out.println("tamaño array primeros numeros: " + primerosNumeros.length);
		
		System.out.println(colores.toString());
		System.out.println(numerosPares.toString());
		System.out.println(primerosNumeros.toString());
		
		//imprimir el contenido del arreglo
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));
		
		//recorrer el arreglo
		for (int i = 0; i < primerosNumeros.length; i++) {
			System.out.println(primerosNumeros[i]);
		}
		System.out.println("");
		for (int i : primerosNumeros) {
			System.out.println(i);
		}
		for (String i : colores) {
			System.out.println(i);
		}
		
		
	}

}
