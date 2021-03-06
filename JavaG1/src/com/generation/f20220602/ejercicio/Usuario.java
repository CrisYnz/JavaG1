package com.generation.f20220602.ejercicio;

public class Usuario {
	private String nombre;
    private String password;
    private String correo;
    private String rut;
    private String direccion;
    private String genero;
    private int edad;
    private int id;
    private boolean esPremium;
    private boolean usuarioBloqueado;
    
    
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String password, String correo, String rut, String direccion, String genero, int edad,
			int id, boolean esPremium, boolean usuarioBloqueado) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.correo = correo;
		this.rut = rut;
		this.direccion = direccion;
		this.genero = genero;
		this.edad = edad;
		this.id = id;
		this.esPremium = esPremium;
		this.usuarioBloqueado = usuarioBloqueado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEsPremium() {
		return esPremium;
	}
	public void setEsPremium(boolean esPremium) {
		this.esPremium = esPremium;
	}
	public boolean isUsuarioBloqueado() {
		return usuarioBloqueado;
	}
	public void setUsuarioBloqueado(boolean usuarioBloqueado) {
		this.usuarioBloqueado = usuarioBloqueado;
	}
    
	//usuario prueba = nombre: usuarioPrueba password: test123 
	public Boolean login(String nombre, String password) {
		
		if (nombre.equals("usuarioPrueba")  && password.equals("test123")  ) {
			System.out.println("Has iniciado Sesion como usuario");
			return true;
		}
		else {
			System.out.println("Acceso denegado");
			return false;
		}
			
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", correo=" + correo + ", rut=" + rut
				+ ", direccion=" + direccion + ", genero=" + genero + ", edad=" + edad + ", id=" + id + ", esPremium="
				+ esPremium + ", usuarioBloqueado=" + usuarioBloqueado + "]";
	}
    
  
}
