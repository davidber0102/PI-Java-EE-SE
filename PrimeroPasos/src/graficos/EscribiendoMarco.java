package graficos;
import java.awt.*;
import javax.swing.*;

public class EscribiendoMarco {
	public static void main(String[] args) {
		MarcoConTexto marco1 = new MarcoConTexto();	
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoConTexto extends JFrame{
	public MarcoConTexto(){
		setVisible(true);
		setSize(600,450);
		setLocation(400, 200);
		setTitle("Bienvenido a Java");		
		Lamina miLamina = new Lamina();
		add(miLamina);
		
	}
}


class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Estamos apreneidno Swing de Java", 100, 100);
		
	}
	
}