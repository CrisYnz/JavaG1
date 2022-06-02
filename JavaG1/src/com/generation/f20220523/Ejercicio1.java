package com.generation.f20220523;

public class Ejercicio1 {

	public static void main(String[] args) {
		// calculo area del triangulo y perimetro de un circulo
		//variables estaticas
		//formula area
		//impresion
		//formula perimetro
		//impresion
		//El área de un triángulo es igual a base por altura partido por 2.
		
		//Declaracion variables area triangulo
		double base = 5.5;
		double altura = 3.2;
		int constanteTriangulo = 2;
		//Declaracion variables perimetro circulo
		double pi = 3.14;
		double radio = 8;
		//Variable para operación area de triangulo
		double areaTriangulo = (base * altura)/constanteTriangulo;
		//Variable para operación perimetro de circulo
		double perimetroCirculo = (2 * pi) * radio;
		
		System.out.println("****************");
		System.out.println("****  Menu *****");
		System.out.println("****************");
		//Se imprime area triangulo
		System.out.println(areaTriangulo);
		//Se imprime perimetro circulo
		System.out.println(perimetroCirculo);
		
		
	}

}
