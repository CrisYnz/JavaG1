package com.generation.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")

public class Usuario {
	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 3, max = 20)
	private String nombre;
	@Size(min = 3, max = 20)
	private String apellido;
	@Size(min = 3, max = 20)
	private String apodo;

	private Integer edad;
	@NotNull
	@Size(min = 6, max = 10)
	private String password;

	// opcionales, sirven para la gestion de BBDD
	@Column(updatable = false) // nunca se va a actualizar a traves del sistema
	private Date createdAt;
	private Date updatedAt;
	
	//OnetoOne
	@OneToOne(mappedBy ="usuario", cascade=CascadeType.ALL,fetch=FetchType.LAZY)//
	private Licencia licencia;
	
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

	// constructor vacio
	public Usuario() {
		super();
	}

	// constructor con parametros
	public Usuario(String nombre, String apellido, String apodo, Integer edad, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.apodo = apodo;
		this.edad = edad;
		this.password = password;
	}
	// getters & setters

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", apodo=" + apodo + ", edad=" + edad + "]";
	}

}
