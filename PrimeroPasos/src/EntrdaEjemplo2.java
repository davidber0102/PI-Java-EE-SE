
import javax.swing.*;
public class EntrdaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreUsuario= JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		int edadUsuario = Integer.parseInt(edad);
		edadUsuario++;	
		
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Utiliznado y manipulando Scanner");
		
		
		System.out.println("Tu nombre es: " + nombreUsuario + " y tu edad el siguiente año sera de: " + (edadUsuario) + " años");
		
		System.out.println("******************************");
		System.out.println("******************************");

	}

}
