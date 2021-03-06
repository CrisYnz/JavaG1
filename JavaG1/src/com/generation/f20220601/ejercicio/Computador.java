package com.generation.f20220601.ejercicio;

public class Computador extends AparatoElectronico {
	String capacidadMemoriaRam;
	String capacidadMemoria;
	Boolean SSD;
	Boolean HDD;
	String sistemaOperativo;
	public Computador() {
		super();
	}
	public Computador(String capacidadMemoriaRam, String capacidadMemoria, Boolean sSD, Boolean hDD,
			String sistemaOperativo) {
		super();
		this.capacidadMemoriaRam = capacidadMemoriaRam;
		this.capacidadMemoria = capacidadMemoria;
		SSD = sSD;
		HDD = hDD;
		this.sistemaOperativo = sistemaOperativo;
	}
	public String getCapacidadMemoriaRam() {
		return capacidadMemoriaRam;
	}
	public void setCapacidadMemoriaRam(String capacidadMemoriaRam) {
		this.capacidadMemoriaRam = capacidadMemoriaRam;
	}
	public String getCapacidadMemoria() {
		return capacidadMemoria;
	}
	public void setCapacidadMemoria(String capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}
	public Boolean getSSD() {
		return SSD;
	}
	public void setSSD(Boolean sSD) {
		SSD = sSD;
	}
	public Boolean getHDD() {
		return HDD;
	}
	public void setHDD(Boolean hDD) {
		HDD = hDD;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	@Override
	public String toString() {
		return "Computador [capacidadMemoriaRam=" + capacidadMemoriaRam + ", capacidadMemoria=" + capacidadMemoria
				+ ", SSD=" + SSD + ", HDD=" + HDD + ", sistemaOperativo=" + sistemaOperativo + "]";
	}
	
	
}
