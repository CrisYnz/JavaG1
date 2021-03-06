package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="elefantes")
public class Elefante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=3, max=20)
	private String nombre;
	@Size(min=3, max=20)
	private String color;
	@Size(min=3, max=20)
	private String madurez;
	
	public Elefante() {
		super();
	}

	public Elefante(Long id, @Size(min = 3, max = 20) String nombre, @Size(min = 3, max = 20) String color,
			@Size(min = 3, max = 20) String madurez) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.madurez = madurez;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadurez() {
		return madurez;
	}

	public void setMadurez(String madurez) {
		this.madurez = madurez;
	}
	
	
}
