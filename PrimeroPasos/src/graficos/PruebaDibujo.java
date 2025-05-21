package graficos;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones marco1 = new MarcoBotones();	
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoConDibujos extends JFrame{
	public MarcoConDibujos(){
		setVisible(true);
		setSize(600,450);
		setLocation(400, 200);
		setTitle("Bienvenido a Java");		
		LaminaConFuentes miLaminaDibujo = new LaminaConFuentes();
		add(miLaminaDibujo);
		
	}
}


class LaminaDibujo extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*g.drawRect(50, 50, 200, 200);
		g.drawLine(150, 150, 100, 400);
		g.drawArc(50, 100, 100, 200, 120, 160);*/
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo =  new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double(175, 5, 400,150);
		
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double cnetrox = rectangulo.getCenterX();
		double cnetroy = rectangulo.getCenterY();
		double radio=150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(cnetrox, cnetroy, cnetrox + radio, cnetroy+radio);
		g2.draw(circulo);
		

	}
	
}