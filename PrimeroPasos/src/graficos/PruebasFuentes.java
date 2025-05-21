package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class PruebasFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fuente = JOptionPane.showInputDialog("Introduce Fuente");
		boolean existeFuente = false;
		
		String [] nomFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		
		
		for(String nombredelafuente: nomFuentes) {
			//System.out.println(nombredelafuente);
			if(nombredelafuente.equals(fuente)) {
				existeFuente = true;
			}
		}
		
		if(existeFuente) {
			System.out.println("Fuente Instalada em el Systema");
		} else {
			System.out.println("Fuente NO instalada em el Systema");
		}

	}

}
