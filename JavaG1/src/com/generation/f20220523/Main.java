package com.generation.f20220523;


public class Main {

	
	public static void main(String[] args) {
		//variables
		//We define the datatype 
		/*Primitive variable types
		 * variables in lower case
		 * String is for text datatype
		 * int is for number
		 * Datatype variable_name = assignment;
		 * String in uppercase
		 * \n line break
		 * \t tab
		 * */
		String nombreEjemplo = "Generation \t asdasd";
		//Syso control + space bar, to print data of a variable 
		System.out.println(nombreEjemplo);
		//single quote, just one char
		char letra = 'a';
		System.out.println(letra);
		//numeric variables
		//8bits
		byte numeroByte = 127;
		System.out.println(numeroByte);
		//16bits
		short numeroShort = 32767;
		System.out.println(numeroShort);
		//32bits
		int numeroInt = 999999999;
		System.out.println(numeroInt);				
		//64bits
		long numeroLong = 2147483647;
		System.out.println(numeroLong);
		//float and double
		
		//boolean variable  (true or false)
		boolean acepta = true;
		System.out.println(acepta);
		
		String genero = "";
		String colorCabello = "";
		boolean compromiso = true;
		
		System.out.println(genero);
		System.out.println(colorCabello);
		System.out.println(compromiso);
		
		long poblacion = 0;
		int edad = 0;
		String nombre = "Cris";
		String ocupacion = "";
		
		System.out.println(poblacion);
		System.out.println(edad);
		System.out.println(nombre);
		System.out.println(ocupacion);
		
		//variables: object type
		
		nombre.charAt(1);
		
		//compare String .equals or equalsIgnoreCase
		
		if (nombre.equals("")) {
			System.out.println("Por favor complete el campo con su nombre");
		}
		
		if (nombre.equalsIgnoreCase("cris")) {
			System.out.println("su nombre es cris");
		}
		
		String curso = "G1";
		if(curso.toLowerCase().equals("g1")) {
			System.out.println("iguales");
		}
		
		if(curso.equals("g1".toUpperCase())) {
			System.out.println("iguales");
		}
		
		//to compare a null should > null == variable
		String curso2 = ""; //empty
		String curso3 = null;
		if (null == curso3) {
			System.out.println("El dato ingresado es nulo");
		}

		//Float y double
		//cast is convert a datatype to another datatype
		//lower case float primitive - upper case float object type
		float altura = (float)1.69;
		Float peso = 73.3f;
		
		System.out.println(altura);
		System.out.println(peso);
		
		//Parse change datatype to work whit it from string
		
		Float gravedad = Float.parseFloat("9.6");
		System.out.println(gravedad);
		
		Integer.parseInt("23");
		Long.parseLong("123123123123123123");
		Float.parseFloat("85.5");
		Double.parseDouble("123123123.12");
		
		//Exercise
		//Como convertir una variable primitiva a variable tipo
		//objeto y viceversa
		
		//Primitive to object
		
		//Create primitive type
		int num1 = 12;
		
		//convert into wrapper object
		Long obj1 = Long.valueOf(num1);
		
		
		System.out.println(obj1.TYPE);
		
		
		
		//Object to primitive
		Long num2 = (long)356;
		
		int var1 = num2.intValue();
		
		System.out.println(var1);
		
		//Conversion de datos
		//automatic
		//byte>short>int>long>float>double
		int num4 = 18;
		float num4f = num4;
		
		//manual
		//double>float>long>int>...
		/*double peso2 = 75.9;
		int peso2F = (int) peso2;*/
	
		Double peso2 = 75.9;
		Float peso2F =  peso2.floatValue();
		
		System.out.println(peso2F);
		
		//float to integer you lose decimals
		// + - * / % (operators)
		// == !=  > >= =< < (comparison)
		int dos = 21214;
		int tres = 33345;
		//
		if (5 == dos + tres) {
			
		}
	}

}
