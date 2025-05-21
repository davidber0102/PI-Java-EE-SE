package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaAciones {
	public static void main(String[] args) {
		MarcoAccion marco = new MarcoAccion();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoAccion extends JFrame{
	public MarcoAccion() {
		super();
		setVisible(true);
		setBounds(500, 300, 800, 300);
		setTitle("---Bienvenido a Java --- Marco con Acciones de Eventos Multitples--");	
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}
}

class PanelAccion extends JPanel{
	public PanelAccion() {		
		AccionColor accionAmarillo = new AccionColor("Amarillo",  new ImageIcon("src/graficos/amarillo.png"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul",  new ImageIcon("src/graficos/azul.png"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo",  new ImageIcon("src/graficos/rojo.png"), Color.RED);
		AccionColor accionVerde = new AccionColor("Verde",  new ImageIcon("src/graficos/verde.png"), Color.GREEN);
		
		/*JButton botonAmarillo  = new JButton(accionAmarillo);
		add(botonAmarillo);*/
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		add(new JButton(accionVerde));		
		
		/*JButton botonAzul  = new JButton("Azul");
		JButton botonRojo  = new JButton("Rojo");
		JButton botonAmarillo  = new JButton("Amarillo");
		JButton botonVerde  = new JButton("Verde");
		
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		add(botonVerde);*/
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl V"), "fondoVerde");
		
		
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondoAmarillo", accionAmarillo);
		mapaAccion.put("fondoAzul", accionAzul);
		mapaAccion.put("fondoRojo", accionRojo);
		mapaAccion.put("fondoVerde", accionVerde);
		
	}
	
	private class AccionColor extends AbstractAction{	
		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("colorFondo", colorBoton);		
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
				Color c = (Color) getValue("colorFondo");	
				setBackground(c);
				System.out.println("Nombre: " + getValue(Action.NAME) +  ", Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
		}
	}
}

