package Ejercicios;

import java.util.*;


public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("David Bernal", "02020202", 200000 );
		Cliente c2 = new Cliente("DaJose Perez", "02020205", 200000 );
		Cliente c3 = new Cliente("Luis Flores", "02020208", 200000 );
		Cliente c4 = new Cliente("Erick Fernandez", "02020222", 200000 );
		Cliente c5 = new Cliente("David Bernal", "02020202", 200000 );
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);
		clientesBanco.add(c5);		
		
		
		/*for(Cliente cliente : clientesBanco) {
		//	System.out.println(cliente.getNombre()+ " " + cliente.getNoCuenta()+ " " + cliente.getSaldo());
			
			if(cliente.getNombre().equals("Luis Flores")) {
				clientesBanco.remove(cliente);
			}
			
		}*/
		
		Iterator<Cliente> it1 = clientesBanco.iterator();
		while(it1.hasNext()) {
			String nombre_cliente = it1.next().getNombre();
			if(nombre_cliente.equals("Luis Flores")) {
				it1.remove();
			}
		}
		
		for(Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre()+ " " + cliente.getNoCuenta()+ " " + cliente.getSaldo());			
			}
			
		
		/*
		Iterator<Cliente> it1 = clientesBanco.iterator();
		while(it1.hasNext()) {
			String nombre_cliente = it1.next().getNombre();
			System.out.println(nombre_cliente);
		}*/
		

	}

}
