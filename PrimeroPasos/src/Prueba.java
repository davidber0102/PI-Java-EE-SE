import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		Scanner mi_escanner = new Scanner(System.in);
		
		Locale miObejto2;
		
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Utiliznado y manipulando Scanner");
		
		System.out.println("Introduce tu nombre: ");	
		String nombreUsuario= mi_escanner.nextLine();
		
		System.out.println("Introduce tu edad");
		
		int edad= mi_escanner.nextInt();
		
		
		System.out.println("Tu nombre es: " + nombreUsuario + " y tu edad es de: " + edad);
		
		System.out.println("******************************");
		System.out.println("******************************");

	}

}
