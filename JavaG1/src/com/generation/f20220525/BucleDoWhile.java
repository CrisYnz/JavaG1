package com.generation.f20220525;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		// DOWHILE
		//A lo menos se ejecuta una vez
		int termino = 20;
		do {
			System.out.println("El valor de termino es: " + termino);
			termino++;
		} while (termino <= 10);
		
		System.out.println("**********");
		
		while (termino <= 10) {
			System.out.println("El valor de termino es: "+ termino);
			termino++;
		}
		Scanner sc = new Scanner(System.in);
		//capturando el ingreso por consola
		int opcion = 0;
		
		
		
		do {
			System.out.println("(0) Salir (1) Sumar (2) Restar (3) Multiplicar (4) Dividir");
			opcion = sc.nextInt();
		} while (opcion < 0 || opcion > 4);
	}
  
	

}
