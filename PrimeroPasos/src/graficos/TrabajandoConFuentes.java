package graficos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TrabajandoConFuentes {

	public static void main(String[] args) {
		MarcoConFuentes marcoColor = new MarcoConFuentes();	
		marcoColor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}

}


class MarcoConFuentes extends JFrame{
	public MarcoConFuentes(){
		setVisible(true);
		setSize(600,450);
		setLocation(400, 200);
		setTitle("Bienvenido a Java - Fuentes");		
		LaminaConFuentes  miLaminaColor= new LaminaConFuentes ();
		add(miLaminaColor);	
		miLaminaColor.setForeground(Color.MAGENTA);
		
		}
}

class LaminaConFuentes extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;	
		
		Font miFuente = new Font("Arial", Font.BOLD, 28);
		g2.setFont(miFuente);
		//g2.setColor(Color.BLUE);
		g2.drawString("David", 100, 100);
		
		g2.setFont(new Font("Cambria", Font.ITALIC, 24));
		g2.setColor(new Color(128, 90, 50).brighter());
		g2.drawString("Bienvenido a las pruebas del usos de la Clase Font", 30, 120);
	}
}