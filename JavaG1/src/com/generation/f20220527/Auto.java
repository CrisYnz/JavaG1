package com.generation.f20220527;

public class Auto {
	// Clase es un modelo o prototipo
	// Objeto, nace
	// Objeto es una abstraccion del mundo real plasmado en un programa
	// Estructura de una clase
	// atributos
	// Constructores
	// accesadores y mutadores (get y set)
	// metodos o funciones

	// atributos

	private String color;
	private String marca;
	private String modelo;
	private Float velocidad;

	// constructores

	// constructor vacio
	public Auto() {

	}

	// constructor con parametros
	/**
	 * @param color
	 * @param marca
	 * @param modelo
	 * @param velocidad
	 */
	public Auto(String color, String marca, String modelo, Float velocidad) {

		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	// accesadores y mutadores
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	// nos permite asignar valores a los atributos
	// tambien nos permite crear instancias o llamadas al objeto
	// private solo la clase accede, public desde cualquier parte

	// metodos o funciones personalzadas

	public void aumentarVelocidad() {
		this.velocidad =  10f;
	}

}
