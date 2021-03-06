package com.generation.f20220602.ejercicio;

public class Cliente extends Usuario {
	private int cantidadCompras;
	private String interes;

	public Cliente() {
		super();
	}

	public Cliente(int cantidadCompras, String interes) {
		super();
		this.cantidadCompras = cantidadCompras;
		this.interes = interes;
	}

	public int getCantidadCompras() {
		return cantidadCompras;
	}

	public void setCantidadCompras(int cantidadCompras) {
		this.cantidadCompras = cantidadCompras;
	}

	public String getInteres() {
		return interes;
	}

	public void setInteres(String interes) {
		this.interes = interes;
	}

	// usuario prueba = nombre: usuarioPrueba password: test123
	@Override
	public Boolean login(String nombre, String password) {

		if (nombre.equals("usuarioPrueba") && password.equals("test123")) {
			System.out.println("Has iniciado Sesion como cliente");
			return true;
		} else {
			System.out.println("Acceso denegado al ?rea de clientes");
			return false;
		}

	}
	
	public String hacerPreguntas(String pregunta) {
		System.out.println("La pregunta ha sido pudblicada como: " + pregunta);
		return pregunta;
	}

}
