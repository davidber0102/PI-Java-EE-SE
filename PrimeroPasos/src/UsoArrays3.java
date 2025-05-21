
import javax.swing.*;
public class UsoArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		String[] paises = new String[8];
		for(int i=0; i<8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i+1));
			
		}

		
		System.out.println("*************************************************************************");
		System.out.println("------------------Ejemplo con Caputaa JOption-----------------");
		
				
		for(String elemento:paises) {
			System.out.println("Nombre de Pais" +  " es: " + elemento);
		}
		System.out.println("------------------------Finalizado----------------------------");
		System.out.println("***************************************************************************");
		

	}

}
