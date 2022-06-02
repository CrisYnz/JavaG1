package com.generation.f20220525;

import java.util.Iterator;
import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//capturando el ingreso por consola
		System.out.println("Ingrese la opcion (1) Entrar; (0) Salir");
		int opcion = sc.nextInt();
		//while valida que la condicion sea verdadera
		
		while ( opcion < 0 || opcion > 4) {
			
			//capturando el ingreso por consola
			System.out.println("Ingrese la opcion (1) Entrar; (0) Salir");
			opcion = sc.nextInt();
		}
		System.out.println("fuera del while");
		
		
	}
}
