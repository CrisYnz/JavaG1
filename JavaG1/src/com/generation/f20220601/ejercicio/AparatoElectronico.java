package com.generation.f20220601.ejercicio;

public class AparatoElectronico extends AparatoElectrico{
	private String diodo;
	private String transistor;
	private String chip;
	private String procesador;
	private int cantidadDeCircuitos;
	
	public AparatoElectronico() {
		super();
	}
	public AparatoElectronico(String diodo, String transistor, String chip, String procesador,
			int cantidadDeCircuitos) {
		super();
		this.diodo = diodo;
		this.transistor = transistor;
		this.chip = chip;
		this.procesador = procesador;
		this.cantidadDeCircuitos = cantidadDeCircuitos;
	}
	public String getDiodo() {
		return diodo;
	}
	public void setDiodo(String diodo) {
		this.diodo = diodo;
	}
	public String getTransistor() {
		return transistor;
	}
	public void setTransistor(String transistor) {
		this.transistor = transistor;
	}
	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getCantidadDeCircuitos() {
		return cantidadDeCircuitos;
	}
	public void setCantidadDeCircuitos(int cantidadDeCircuitos) {
		this.cantidadDeCircuitos = cantidadDeCircuitos;
	}
	@Override
	public String toString() {
		return "AparatoElectronico [diodo=" + diodo + ", transistor=" + transistor + ", chip=" + chip + ", procesador="
				+ procesador + ", cantidadDeCircuitos=" + cantidadDeCircuitos + "]";
	}
	
	
}
