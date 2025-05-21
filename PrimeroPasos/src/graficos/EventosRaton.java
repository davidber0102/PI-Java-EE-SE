package graficos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class EventosRaton {
	public static void main(String[] args) {
		MarcoConRaton marco = new MarcoConRaton();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConRaton extends JFrame{
	public MarcoConRaton(){
		super();
		setVisible(true);
		setBounds(700, 300, 600, 750);
		setTitle("---Bienvenido a Java --- Marco con Uso de Teclas--");	
		
		EventoRaton nuevoRaton = new EventoRaton();
		addMouseListener(nuevoRaton);
		
		EventoRatonMover ratonMover = new EventoRatonMover();
		addMouseMotionListener(ratonMover);
	}
}

class EventoRaton implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(" Has hecho click en la Ventana");
		System.out.println("Ubicacion del Click en X: " + e.getX() + " y en Y es: " + e.getY());
		System.out.println(e.getClickCount());
		System.out.println();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println();
		System.out.println(" Acabas de presionar en la Ventana");
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Presionaste Click Izquierdo");
		}else if (e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Presionaste Click Izquierdo");
		}else if(e.getModifiersEx()== MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Presionaste el ScroolBar");
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println(" Acabas de levantar Tecla en la Ventana");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println(" Acabas de entrar en la Ventana");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println(" Acabas de salir en la Ventana");
	}
}

class EventoRatonMover implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas Arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas Moviendo");
		
	}
	
}