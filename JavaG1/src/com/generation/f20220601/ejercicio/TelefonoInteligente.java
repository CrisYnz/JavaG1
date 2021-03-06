package com.generation.f20220601.ejercicio;

public class TelefonoInteligente extends AparatoElectronico {
	String pantallaTactil;
	String camara;
	String modelo;
	public TelefonoInteligente() {
		super();
	}
	public TelefonoInteligente(String pantallaTactil, String camara, String modelo) {
		super();
		this.pantallaTactil = pantallaTactil;
		this.camara = camara;
		this.modelo = modelo;
	}
	public String getPantallaTactil() {
		return pantallaTactil;
	}
	public void setPantallaTactil(String pantallaTactil) {
		this.pantallaTactil = pantallaTactil;
	}
	public String getCamara() {
		return camara;
	}
	public void setCamara(String camara) {
		this.camara = camara;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "TelefonoInteligente [pantallaTactil=" + pantallaTactil + ", camara=" + camara + ", modelo=" + modelo
				+ "]";
	}
	
	
	
}
