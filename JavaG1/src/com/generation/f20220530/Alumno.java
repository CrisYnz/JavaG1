package com.generation.f20220530;

import com.generation.f20220531.Cliente;

public class Alumno {
	//atributos
	private String nombre;
	private String apellido;
	private int edad;
	private String curso;
	
	
	//constructores
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String apellido, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}
	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//Metodo para hacer una impresion
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}
	
	
	
	
	
	
}