package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ColeccionesMap {

	public static void main(String[] args) {
		// colecciones Map/hashmap
		// Pares clave <-> valor
		// HashMap<K, V> map = new HashMap<K, V>();
		// La K es key o clave
		// La V es value o valor
		// HashMap mapa = new HashMap();

		HashMap objetoHashMap = new HashMap();

		objetoHashMap.put("Nombre", "Cristian");
		objetoHashMap.put("Nombre2", "Andres");
		objetoHashMap.put("ApellidoP", "Yanez");
		objetoHashMap.put("ApellidoM", "Barraza");
		System.out.println("Elementos del mapa");
		System.out.println(objetoHashMap);
		// Ingreso de datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad:");
		int edad = sc.nextInt();
		objetoHashMap.put("Edad", edad);
		System.out.println(objetoHashMap);
		// Hashmap no trabaja con posicion
		// Obtener un valor
		System.out.println(objetoHashMap.get("ApellidoP"));

		objetoHashMap.remove("Edad");
		// Mostrar llaves disponibles
		System.out.println(objetoHashMap.keySet());

		// Mostrar valores en el mapa

		// Agregar valores a un hashmap desde un ArrayList generado por input (ingreso
		// de usuario)
		System.out.println(objetoHashMap.values());
		// Se crea un ArrayList
		ArrayList<String> vocales = new ArrayList<String>();

		boolean seguir = true;
		while (seguir) {
			System.out.println("Ingrese la vocal que desea agregar:");
			String vocal = sc.next();
			vocales.add(vocal);

			System.out.println("Desea agregar mas vocales? 1)Si 2)No ");
			int respuesta = sc.nextInt();

			if (respuesta == 2) {
				System.out.println("saliendo del programa");
				break;
			}
		}
		//Agregamos array vocales a la key vocales del hashmap objetoHashmap
		objetoHashMap.put("vocales", vocales);
		System.out.println(objetoHashMap.values());

		// Como recorrer un hashmap
		// Para recorrerlo debe ser String
		// Al trabajarlo de esta forma no se puede a?adir un Array al value
		for (Object clave : objetoHashMap.keySet()) {
			System.out.println("Clave " + clave + " - valor: " + objetoHashMap.get(clave));

		}

	}

}
