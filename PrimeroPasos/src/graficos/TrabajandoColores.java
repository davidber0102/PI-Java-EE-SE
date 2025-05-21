package graficos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {
	public static void main(String[] args) {
		MarcoConDibujos marcoColor = new MarcoConDibujos();	
		marcoColor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}
}

class MarcoConColor extends JFrame{
	public MarcoConColor(){
		setVisible(true);
		setSize(600,450);
		setLocation(400, 200);
		setTitle("Bienvenido a Java - COLORES");		
		LaminaConFuentes miLaminaColor= new LaminaConFuentes();
		add(miLaminaColor);	
		miLaminaColor.setBackground(SystemColor.window);
		}
}

class LaminaConColor extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
				
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo =  new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.RED);
		
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double(175, 5, 400,150);		
		elipse.setFrame(rectangulo);
		g2.setPaint( new Color(100,170,55).brighter());
		g2.fill(elipse);
		
		Line2D linea = new Line2D.Double(100, 100, 300, 250);
		g2.setPaint(new Color(120,10,155).darker());
		g2.draw(linea);
		
		double cnetrox = rectangulo.getCenterX();
		double cnetroy = rectangulo.getCenterY();
		double radio=150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(cnetrox, cnetroy, cnetrox + radio, cnetroy+radio);
		g2.setPaint(Color.MAGENTA);
		g2.draw(circulo);		
	}
}