import java.util.Scanner;

public class EvaluaEdad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("******************************");
			System.out.println("******************************");
			System.out.println("Utiliznado y manipulando Scanner");
			
			System.out.println("Introduce tu edad, por favor");
			int edad= entrada.nextInt();
			
			if(edad < 18) {
				System.out.println("Eres un adolescente");
			} else if (edad < 40) {
				System.out.println("Eres un Joven");
			} else if (edad <65) {
				System.out.println("Eres un maduro");
			}else {
				System.out.println("Cuidate");
			}
			
			
		}
		
		
		System.out.println("******************************");
		System.out.println("******************************");

	}

	}

