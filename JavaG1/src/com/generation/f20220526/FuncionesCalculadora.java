package com.generation.f20220526;

import java.util.Scanner;

public class FuncionesCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese num1 ");
		int num1 = sc.nextInt();

		System.out.println("Ingrese num2 ");
		int num2 = sc.nextInt();
		System.out.println("Ingrese opcion 1 suma  2 resta 3 multiplicar  4 dividir  5 restar");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			suma(num1, num2);
			break;
		case 2:
			resta(num1, num2);
			break;
		case 3:
			multiplicar(num1, num2);
			break;
		case 4:
			dividir(num1, num2);
			break;
		case 5:
			modulo(num1, num2);
			break;
		default:
			break;
		}
	}

	public static int suma(int num1, int num2) {

		int resultadoSuma = num1 + num2;
		return resultadoSuma;
	}

	public static int resta(int num1, int num2) {

		int resultadoResta = num1 - num2;
		return resultadoResta;
	}

	public static int multiplicar(int num1, int num2) {

		int resultado = num1 * num2;
		return resultado;
	}

	public static double dividir(int num1, int num2) {

		int resultado = num1 / num2;
		return resultado;
	}

	public static double modulo(int num1, int num2) {

		int resultado = num1 % num2;
		return resultado;
	}
}
