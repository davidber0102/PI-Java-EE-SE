package excepciones_I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Que deseas hacer?");
		System.out.println("1.- Introducir Datos");
		System.out.println("2.- Salir del programa");
		
		Scanner entrada = new Scanner (System.in);
		
		int decision = entrada.nextInt();
		
		if (decision == 1 ) {
			try {
				pedirDatos();
			}catch(InputMismatchException e){
				System.out.println("Verifica tus datos de entrada");
				}
		}else {
			System.out.println("Gracias por su consulta, B Y E");
			System.exit(0);
		}

		entrada.close();
	}

	private static void pedirDatos()throws InputMismatchException{
		// TODO Auto-generated method stub
		//try {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario = entrada.nextLine();
		System.out.println("Introduce tu edad, por favor");
		int edad = entrada.nextInt();
		System.out.println("Hola" + nombre_usuario + ".  El año que viene tendras " + (edad+1)+ " años");
		entrada.close();
		//}catch(InputMismatchException e){
			//System.out.println("Verifica tus datos de entrada");
		//}
		System.out.println("Gracias por su consulta, B Y E");
		
		
	}

}
