import java.util.*;
public class evaluaEdad {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("******************************");
			System.out.println("******************************");
			System.out.println("Utiliznado y manipulando Scanner");
			
			System.out.println("Introduce tu edad, por favor");
			int edad= entrada.nextInt();
			
			if(edad>=18) {
				System.out.println("Eres mayor de edad");
			}else {
				System.out.println("Eres menor de edad");
			}
		}
		
		
		System.out.println("******************************");
		System.out.println("******************************");

	}

}
