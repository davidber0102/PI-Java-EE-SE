
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {
	public static void main(String[] args) {
		 MarcoCalculadora marco = new MarcoCalculadora();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {		
		setVisible(true);
		setBounds(400, 400, 500, 400);
		setTitle("---Bienvenido a Java --- CALCULADORA--");	
		laminaCalculadora lamina = new laminaCalculadora();
		add(lamina);
		//pack();
		}
	}

class laminaCalculadora extends JPanel{
	public laminaCalculadora() {
		principio=true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new insertaNumero();
		ActionListener orden = new accionOrden();
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);		
		
		add(milamina2, BorderLayout.CENTER);
		ultimaOperacion="=";
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);		
		milamina2.add(boton);				
	}
	
		
	private class insertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand();
			if(principio) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText() + entrada);
		}
	}
	
	private class accionOrden implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion = e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			
			principio=true;
			
			
		}

		public void calcular(double x) {
			if(ultimaOperacion.equals("+")){
				resultado+=x;	
			}
			else if (ultimaOperacion.equals("-")) {
				resultado-=x;	
			}
			else if (ultimaOperacion.equals("*")) {
				resultado*=x;	
			}
			else if (ultimaOperacion.equals("/")) {
				resultado/=x;	
			}		
			else if (ultimaOperacion.equals("=")) {
				resultado=x;
			}
			pantalla.setText("" +resultado);
		}
		
	}
	
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
}
