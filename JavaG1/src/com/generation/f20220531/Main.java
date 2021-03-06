package com.generation.f20220531;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		// arreglo clientes
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		// Instancia de cliente
		Cliente cliente = new Cliente();
		// cliente . id = 1234; no funciona en private, solo a nivel package. para
		// acceder en private se necesitan getters and setters

		cliente.setId(1234);
		cliente.setNombre("Donato");
		cliente.setRut("123456789-0");

		do {
			// excepciones
			Cliente clienteDatosDinamicos = new Cliente();

			System.out.println("Ingrese el Id de Cliente");
			// Integer id = sc.nextInt();
			String idString = sc.nextLine();
			try {
				Integer id = Integer.parseInt(idString);
				clienteDatosDinamicos.setId(id);
			} catch (ArithmeticException ae) {
				System.out.println("No se puede dividir por 0");
			} catch (NullPointerException npe) {
				System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
			} catch (InputMismatchException ime) {
				System.out.println(" Error en el ingreso de un dato ");
			} catch (NumberFormatException nfe) {
				System.out.println(" No puede ingresar una letra como id " + nfe);
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error, contacte con el administrador" + e.getMessage());
			}

			//
			sc.nextLine();
			System.out.println("Ingrese el nombre de Cliente");
			String nombre = sc.nextLine();
			clienteDatosDinamicos.setNombre(nombre);

			System.out.println("Ingrese el correo de Cliente");
			String correo = sc.nextLine();
			clienteDatosDinamicos.setCorreo(correo);

			System.out.println("Ingrese el rut de Cliente");
			String rut = sc.nextLine();
			clienteDatosDinamicos.setRut(rut);

			// agregar cliente a la lista
			listaCliente.add(clienteDatosDinamicos);
			
			/*System.out.println(clienteDatosDinamicos.getNombre());
			System.out.println(clienteDatosDinamicos.getRut());
			System.out.println(clienteDatosDinamicos.getCorreo());
			System.out.println(clienteDatosDinamicos.getId());*/
			do {
				System.out.println("Desea ingresar un nuevo cliente? (1) si (0) no");
				opcion = sc.nextInt();
			} while (opcion < 0 || opcion > 1);
			sc.nextLine();
		} while (opcion == 1);
		
		//acceder al metodo de otra clase
		
		ClienteManager cm = new ClienteManager();
		cm.recorrerArregloCliente(listaCliente);
	}

}
