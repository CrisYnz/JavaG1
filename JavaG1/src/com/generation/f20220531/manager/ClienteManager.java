package com.generation.f20220531.manager;
import java.util.List;

import com.generation.f20220531.Cliente;
public class ClienteManager {
	// recorrer el arreglo e imprimir
	//logica de negocio y validaciones
	public void recorrerArregloCliente(List<Cliente> listaCliente) {
		/*
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.toString());
			
		}
		*/
		for (int i = 0; i < listaCliente.size(); i++) {
			System.out.println("Cliente "+ i +": "+ listaCliente.toString());
		}
	}
	
	
	

}
