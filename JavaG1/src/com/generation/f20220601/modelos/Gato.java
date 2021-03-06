package com.generation.f20220601.modelos;

public class Gato extends Mascota{
//la palabra extends significa que estamos usando herencia
	private Boolean garrasRtractil;
	private Boolean visionNocturna;
	private String sonidoVocal;
	
	
	
	
	
	public Gato() {
		super();
	}





	public Gato(Boolean garrasRtractil, Boolean visionNocturna, String sonidoVocal) {
		super();
		this.garrasRtractil = garrasRtractil;
		this.visionNocturna = visionNocturna;
		this.sonidoVocal = sonidoVocal;
	}


	


	public Boolean getGarrasRtractil() {
		return garrasRtractil;
	}





	public void setGarrasRtractil(Boolean garrasRtractil) {
		this.garrasRtractil = garrasRtractil;
	}





	public Boolean getVisionNocturna() {
		return visionNocturna;
	}





	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}





	public String getSonidoVocal() {
		return sonidoVocal;
	}





	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}


	


	@Override
	public String toString() {
		return "Gato [garrasRtractil=" + garrasRtractil + ", visionNocturna=" + visionNocturna + ", sonidoVocal="
				+ sonidoVocal + "]" + super.toString();
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Miau, Miau");
	}
}
