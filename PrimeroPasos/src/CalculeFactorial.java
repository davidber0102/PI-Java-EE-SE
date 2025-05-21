import javax.swing.*;
public class CalculeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado =1L;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero, por favor"));
		
		for(int i =numero; i>0; i--) {
			resultado= resultado*i;
		}
		
		
		System.out.println("******************************");
		System.out.println("Calculo del Factorial de un numerol");		
		System.out.println("******************************");
		
		System.out.println("-------El factorial de su numero "+ numero + " es: " + resultado );
		
		System.out.println("******************************");
		System.out.println("******************************");


	}

}
