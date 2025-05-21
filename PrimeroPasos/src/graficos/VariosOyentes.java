package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VariosOyentes {
	public static void main(String[] args) {
		MarcoPrincipal marco = new MarcoPrincipal();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPrincipal extends JFrame{	
	public MarcoPrincipal() {
		super();
		setVisible(true);
		setBounds(1300, 100, 300, 200);
		setTitle("---Bienvenido a Java --- Marco con Acciones de Eventos Multitples--");	
		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
	}
}

class LaminaPrincipal extends JPanel{
	public LaminaPrincipal() {
		JButton botonNuevo = new JButton("Nuevo");		
		add(botonNuevo);			
		botonCerrar = new JButton("Cerrar Todo");
		add(botonCerrar);
		
		oyenteNuevo miOyente = new oyenteNuevo();
		botonNuevo.addActionListener(miOyente);
	}
	
	private class oyenteNuevo implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marcoNuevo = new MarcoEmergente(botonCerrar);
			marcoNuevo.setVisible(true);
		}
	}
	JButton botonCerrar;
}

class MarcoEmergente extends JFrame{

	public MarcoEmergente(JButton botonPrincipal){
		super();		
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		botonPrincipal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodos implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
	}
	
	private static int contador=0;
	
}