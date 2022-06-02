package cl.generation.modelos;

public class ItemAgenda {
	private String Nombre;
	private String Inicio;
	private String Termino;
	private int puntaje;
	private String categoria;
	
	
	public ItemAgenda() {
		super();
	}
	
	public ItemAgenda(String nombre, String inicio, String termino, int puntaje, String categoria) {
		super();
		Nombre = nombre;
		Inicio = inicio;
		Termino = termino;
		this.puntaje = puntaje;
		this.categoria = categoria;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getInicio() {
		return Inicio;
	}
	public void setInicio(String inicio) {
		Inicio = inicio;
	}
	public String getTermino() {
		return Termino;
	}
	public void setTermino(String termino) {
		Termino = termino;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
