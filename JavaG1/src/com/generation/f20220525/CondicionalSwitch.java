package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// menu
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese opción:");
		System.out.println("1 sumar ");
		System.out.println("2 restar ");
		System.out.println("3 multiplicar ");
		System.out.println("4 dividir ");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("es Suma");
			break;

		case 2:
		case 3:
		case 4:
		default:
			System.out.println("Opcion invalida");
			break;
		}
		
		System.out.println("Fuera del switch");
	}

}
