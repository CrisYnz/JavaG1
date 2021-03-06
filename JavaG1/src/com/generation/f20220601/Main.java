package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Michi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		// Herencia
		Mascota mascota = new Mascota();
		mascota.setColor("gris");
		mascota.setNombre("tom");
		
		Perro perro = new Perro();
		perro.setColor("Red Fawn");
		perro.setNombre("Ayun");
		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("pelo");
		gato.setPeso(3);
		
		System.out.println(gato.toString());
		
		Michi michi = new Michi(true);
		System.out.println(michi.toString());
		
		// Polimorfismo, puede servir para la sobrecarga de metodos
		List <Mascota> listaMascotas = new ArrayList<Mascota>();
		Mascota regalon = new Mascota("Negro", "Canes","Pelo","Firulais",1.5f,"Macho");
		listaMascotas.add(regalon);
		
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		listaMascotas.add(felix);
		
		Mascota chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Cafe");
		chocolo.setPeso(10);
		listaMascotas.add(chocolo);
		
		regalon.hacerSonido();
		felix.hacerSonido();
		chocolo.hacerSonido();
		System.out.println("******");
		//recorrer el arreglo
		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
		}
		
		//transformar el objeto generico a uno especifico
		
		Perro perroChocolo = (Perro) chocolo;
	}

}
