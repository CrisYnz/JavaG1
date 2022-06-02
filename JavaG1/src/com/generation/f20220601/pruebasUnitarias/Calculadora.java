package com.generation.f20220601.pruebasUnitarias;

public class Calculadora {
	public int suma (int num1, int num2) {
		return num1 + num2;
	}
	
	public int resta (int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicacion (int num1, int num2) {
		return num1 * num2;
	}
	
	public String division (int num1, int num2) {
		
		if (num2 !=0) {
			String resultado = Integer.toString(num1/num2);
			return resultado;
		}
			return "no se puede dividir por 0";
	}
	
	public boolean esPar(int num){
		if(num%2 == 0) {
			return true; //si es par, devuelve true
		}
		
		else {
			return false;
		}
	}
	
	public boolean esImpar(int num){
		if(num%2 != 0) {
			return true; //Si NO es par, devuelve true
		}
		
		else {
			return false;
		}
	}
	
}
