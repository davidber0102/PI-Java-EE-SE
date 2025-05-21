package graficos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.*;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos2 {
	public static void main(String[] args) {
		MarcoBotones2 marcoBtn = new MarcoBotones2();	
		marcoBtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones2 extends JFrame{
	public MarcoBotones2(){
		setVisible(true);
		setBounds(750, 300, 500, 350);
		setTitle("Bienvenido a Java --- Marco con Botones");		
		LaminaConBotones2  miLamina= new LaminaConBotones2();
		add(miLamina);	
		}
}

class LaminaConBotones2 extends JPanel  {
	JButton botonAzul  = new JButton("Azul");
	JButton botonRojo  = new JButton("Rojo");
	JButton botonAmarillo  = new JButton("Amarillo");
	JButton botonVerde  = new JButton("Verde");

	public LaminaConBotones2() {
		
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		add(botonVerde);
		
		ColorFondo Amarillo = new ColorFondo(Color.yellow);
		ColorFondo Rojo = new ColorFondo(Color.red);
		ColorFondo Azul = new ColorFondo(Color.blue);
		ColorFondo Verde = new ColorFondo(Color.green);
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
		botonVerde.addActionListener(Verde);		
	}
	
	private class ColorFondo implements ActionListener {
		private Color colorFondo;
		public ColorFondo(Color c) {
			colorFondo = c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {	
			setBackground(colorFondo);
		}
	}
}