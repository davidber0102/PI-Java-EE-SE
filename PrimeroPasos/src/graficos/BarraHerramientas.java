package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Color;


public class BarraHerramientas {
	
	public static void main(String[] args) {
		MarcoBarra marco = new MarcoBarra();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

	class MarcoBarra extends JFrame{
		JPanel lamina;
		public MarcoBarra() {
			
			setBounds(600, 300, 600, 400);
			setTitle("---Bienvenido Barra de Herramintas---");	
			lamina = new JPanel();
			add(lamina);
			// configuaraciones de acciones
			Action accionAmarillo = new AccionColor("Amarillo",  new ImageIcon("src/graficos/amarillo.png"), Color.YELLOW);
			Action accionAzul = new AccionColor("Azul",  new ImageIcon("src/graficos/azul.png"), Color.BLUE);
			Action accionRojo = new AccionColor("Rojo",  new ImageIcon("src/graficos/rojo.png"), Color.RED);
			Action accionVerde = new AccionColor("Verde",  new ImageIcon("src/graficos/verde.png"), Color.GREEN);
			
			Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/cerrar2.png")) {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			};
			
			
			JMenu menu = new JMenu("Color");
			menu.add(accionAzul);
			menu.add(accionVerde);
			menu.add(accionRojo);
			menu.add(accionAmarillo);
			
			JMenuBar barraMenus = new JMenuBar();
			barraMenus.add(menu);
			
			setJMenuBar(barraMenus);
			
			//Construccion de la barra de herramientas
			JToolBar barra = new JToolBar();
			barra.add(accionVerde);
			barra.add(accionRojo);
			barra.add(accionAzul);
			barra.add(accionAmarillo);
			barra.addSeparator();
			barra.add(accionSalir);
			
			add(barra, BorderLayout.NORTH);

		}
	
	
	private class AccionColor extends AbstractAction{	
		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("color", colorBoton);		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color");	
			lamina.setBackground(c);
			System.out.println("Nombre: " + getValue(Action.NAME) +  ", Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
			
		}
	}
	
	}

