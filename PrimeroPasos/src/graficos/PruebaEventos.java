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

public class PruebaEventos {
	public static void main(String[] args) {
		MarcoBotones marcoBtn = new MarcoBotones();	
		marcoBtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame{
	public MarcoBotones(){
		setVisible(true);
		setBounds(750, 300, 500, 350);
		setTitle("Bienvenido a Java --- Marco con Botones");		
		LaminaConBotones  miLamina= new LaminaConBotones();
		add(miLamina);	
		}
}

class LaminaConBotones extends JPanel implements ActionListener {
	JButton botonAzul  = new JButton("Azul");
	JButton botonRojo  = new JButton("Rojo");
	JButton botonAmarillo  = new JButton("Amarillo");
	JButton botonVerde  = new JButton("Verde");

	public LaminaConBotones() {
		super();
		
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		add(botonVerde);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonVerde.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		Object btnPulsado= e.getSource();		
		if(btnPulsado==botonAzul) {			setBackground(Color.blue);		} 
			else if (btnPulsado==botonAmarillo) {			setBackground(Color.yellow);		}
				else if (btnPulsado==botonRojo) {			setBackground(Color.red);		}
					else {			setBackground(Color.green);		}	
	}
	
}