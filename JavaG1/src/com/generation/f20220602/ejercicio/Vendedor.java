package com.generation.f20220602.ejercicio;

public class Vendedor extends Usuario {
	private int cantidadPublicaciones;
	private Boolean puedePublicar;

	public Vendedor() {
		super();
	}

	public Vendedor(int cantidadPublicaciones, Boolean puedePublicar) {
		super();
		this.cantidadPublicaciones = cantidadPublicaciones;
		this.puedePublicar = puedePublicar;
	}

	public int getCantidadPublicaciones() {
		return cantidadPublicaciones;
	}

	public void setCantidadPublicaciones(int cantidadPublicaciones) {
		this.cantidadPublicaciones = cantidadPublicaciones;
	}

	public Boolean getPuedePublicar() {
		return puedePublicar;
	}

	public void setPuedePublicar(Boolean puedePublicar) {
		this.puedePublicar = puedePublicar;
	}

	// Vendedor prueba = nombre: vendedorPrueba password: test123
	@Override
	public Boolean login(String nombre, String password) {

		if (nombre.equals("usuarioPrueba") && password.equals("test123")) {
			System.out.println("Has iniciado Sesion como vendedor");
			return true;
		} else {
			System.out.println("Acceso denegado al area de vendedores");
			return false;
		}

	}
	
	public String respondePreguntas(String respuesta) {
		System.out.println("su respuesta es: " + respuesta);
		return respuesta;
	} 

}
