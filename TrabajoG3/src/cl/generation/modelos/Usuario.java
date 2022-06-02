package cl.generation.modelos;

public class Usuario {
	private String nombre;
	private int edad;
	private String genero;
	private String correo;
	private int id;
	private String ocupacion;
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, int edad, String genero, String correo, int id, String ocupacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.correo = correo;
		this.id = id;
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	
}
