package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {
	public static void main(String[] args) {
		MarcoImagenes marcoImg = new MarcoImagenes();	
		marcoImg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoImagenes extends JFrame{
	public MarcoImagenes(){
		setVisible(true);
		setBounds(750, 300, 300, 350);
		setTitle("Bienvenido a Java --- Marco con Imagenes");		
		LaminaConImagen  miLamina= new LaminaConImagen();
		add(miLamina);	
		miLamina.setForeground(Color.MAGENTA);
		}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		//File rutaImagen = new File ("src/graficos/bi_.png");
		try {
			miImagen = ImageIO.read(new File ("src/graficos/bi_.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se encontro imagen, revisar!!!!");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int anchoImg = miImagen.getWidth(this);
		int altoImg = miImagen.getHeight(this);
		
		g.drawImage(miImagen, 0,0, null);
		
		for(int i=0; i<300;i++) {
			for(int j=0; j<300;j++) {
				if(i+j>0) {
					g.copyArea(0, 0, anchoImg, altoImg, anchoImg*i, altoImg*j);
				}
				
			}
		}
	}	
	private Image miImagen;	
	
}
