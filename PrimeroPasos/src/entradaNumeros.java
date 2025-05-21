
import javax.swing.*;

public class entradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10000.0;
		System.out.println(x/3);
		System.out.printf("%1.2f", x/3 );
		
		String num1= JOptionPane.showInputDialog("Introduce un numero, por favor");
		
		double num1Conver  = Double.parseDouble(num1);
		
		System.out.print("\n La raiz de " + num1Conver + " es ");
		System.out.printf("%1.2f", Math.sqrt(num1Conver));
		

	}

}
