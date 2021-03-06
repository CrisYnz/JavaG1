package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220531.Cliente;

public class Main {

	public static void main(String[] args) {
		//Creamos una lista para Alumnos
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		// Instancia de una clase
		// Objeto en UPPERCASE y variable en LOWERCASE
		Alumno alumno = new Alumno(); // Inicializamos la variable sin valores ni atributos, haciendo uso del
										// constructor vacio
		//Alumno alumno2 = new Alumno("Leonardo", "Utreras", 26, "G1");
		// Inicializamos la variable con valores por default, haciendo uso del constructor con
		// parametros
		
		//instancia de clases
		Alumno alumno2 = new Alumno ("Cristobal", "Hapsoo", 23,"G1");
		Alumno alumno3 = new Alumno ("Cristian", "Ya?ez", 26,"G1");
		Alumno alumno4 = new Alumno ("Alejandro", "Heredia", 29,"G1");
		Alumno alumno5 = new Alumno ("Luis", "Garc?a", 28,"G1");
		Alumno alumno6 = new Alumno ("joao", "Aranda", 28,"G1");
		System.out.println(alumno.getNombre());
		System.out.println(alumno2.getNombre());
		
		//Agregamos las instancias a la lista creada
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		//for each
		System.out.println("-- Este es el for each --");
		for (Alumno objetoAlumno : listaAlumnos) {
			//imprime toString
			System.out.println(objetoAlumno.toString());
		}
		//for
		System.out.println("-- Este es el for --");
		for (int i = 0; i < listaAlumnos.size(); i++) {
			//imprime los datos solicitados con get
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
		}
		// setter
		alumno.setNombre("Cris");
		
		//getter
		System.out.println("--------- Grupo 3 --------");
		System.out.println("Nombre Alumno 1: " + alumno2.getNombre());
		System.out.println("Nombre Alumno 2: " + alumno3.getNombre());
		System.out.println("Nombre Alumno 3: " + alumno4.getNombre());
		System.out.println("Nombre Alumno 4: " + alumno5.getNombre());
		System.out.println("Nombre Alumno 5: " + alumno6.getNombre());

		System.out.println("Apellido Alumno 1: " + alumno2.getApellido());
		System.out.println("Apellido Alumno 2: " + alumno3.getApellido());
		System.out.println("Apellido Alumno 3: " + alumno4.getApellido());
		System.out.println("Apellido Alumno 4: " + alumno5.getApellido());
		System.out.println("Apellido Alumno 5: " + alumno6.getApellido());

		System.out.println("Edad Alumno 1: " + alumno2.getEdad());
		System.out.println("Edad Alumno 2: " + alumno3.getEdad());
		System.out.println("Edad Alumno 3: " + alumno4.getEdad());
		System.out.println("Edad Alumno 4: " + alumno5.getEdad());
		System.out.println("Edad Alumno 5: " + alumno6.getEdad());

		System.out.println("Curso Alumno 1: " + alumno2.getCurso());
		System.out.println("Curso Alumno 2: " + alumno3.getCurso());
		System.out.println("Curso Alumno 3: " + alumno4.getCurso());
		System.out.println("Curso Alumno 4: " + alumno5.getCurso());
		System.out.println("Curso Alumno 5: " + alumno6.getCurso());
		
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		System.out.println(alumno4.toString());
		System.out.println(alumno5.toString());
		System.out.println(alumno6.toString());
		// System.out.println(alumno); muestra la ubicaci?n de la clase
		
		
	}
}
