import java.util.*;
import javax.swing.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroAleatorio = (int) (Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos=0;
		
		
		
		System.out.println("******************************");
		System.out.println("*Adivina el Numero");		
		System.out.println("******************************");
		
		System.out.println("El numero Aleatorio es " + numeroAleatorio);
		
		System.out.println("******************************");
		System.out.println("******************************");
		
		do {
			intentos++;
			System.out.println("---Introduce un numero, por favor");
			numero = entrada.nextInt();
			if(numeroAleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(numeroAleatorio > numero) {
				System.out.println("Mas alto");
			}
			
		}while(numero != numeroAleatorio);
		System.out.println("Correcto, lo has conseguido en " + intentos + " intentos");

	}

}
