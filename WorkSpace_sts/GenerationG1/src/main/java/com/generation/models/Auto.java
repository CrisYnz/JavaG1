package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="autos")
public class Auto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=3, max=20)
	private String nombre;
	@Size(min=3, max=20)
	private String marca;
	@Size(min=3, max=20)
	private String color;
	@Size(min=3, max=20)
	private String velocidad;
	
	//constructor vacio
	public Auto() {
		super();
	}
	//constructor con parametros
	public Auto(Long id, @Size(min = 3, max = 20) String nombre, @Size(min = 3, max = 20) String marca,
			@Size(min = 3, max = 20) String color, @Size(min = 3, max = 20) String velocidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String toString() {
		return "Auto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", color=" + color + ", velocidad="
				+ velocidad + "]";
	}
	
	
	
}
