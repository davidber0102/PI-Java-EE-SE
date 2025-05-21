
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "David";
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Utiliznado y manipulando la Calse String ");
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " Caracteres");
		System.out.println("La primera letra de mi nombre " + nombre +" es la letra " + nombre.charAt(0));
		int ultima_letra;
		ultima_letra = nombre.length();
		System.out.println("Y la ultima letra de mi " + nombre + " es la letra " + nombre.charAt(ultima_letra-1));
		
		System.out.println("******************************");
		System.out.println("******************************");
		

	}

}
