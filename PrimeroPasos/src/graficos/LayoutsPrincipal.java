package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutsPrincipal {

	public static void main(String[] args) {
		MarcoLayout marco = new MarcoLayout();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoLayout extends JFrame{
	public MarcoLayout() {
		super();
		setVisible(true);
		setBounds(600, 350, 600, 200);
		setTitle("---Bienvenido a Java --- Marco con Acciones de Eventos Multitples--");	
		PanelLayout lamina = new PanelLayout();
		PanelLayout2 lamina2 = new PanelLayout2();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT); 
		//lamina.setLayout(disposicion);
		
		add(lamina, BorderLayout.NORTH);
		add(lamina2, BorderLayout.CENTER);
	}
}

class PanelLayout extends JPanel{
	public PanelLayout(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"), BorderLayout.NORTH);
		add(new JButton("Rojo"), BorderLayout.SOUTH);
		
		//setLayout(new FlowLayout(FlowLayout.CENTER, 75, 50));
	}
}


class PanelLayout2 extends JPanel{
	public PanelLayout2(){
		setLayout(new BorderLayout(10, 10));
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Rosa"), BorderLayout.CENTER);
	}
	}