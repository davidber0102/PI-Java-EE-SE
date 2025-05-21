package graficos;
import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class EventosTeclado {
	public static void main(String[] args) {
		MarcoConTeclas marco = new MarcoConTeclas();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConTeclas extends JFrame{
	public MarcoConTeclas(){
		super();
		setVisible(true);
		setBounds(700, 300, 600, 750);
		setTitle("---Bienvenido a Java --- Marco con Uso de Teclas--");	
		
		EventoTeclado nuevoTeclado = new EventoTeclado();
		addKeyListener(nuevoTeclado);
	}
}

class EventoTeclado implements KeyListener{
	@Override
	public void keyTyped(KeyEvent e) {	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		char letra = e.getKeyChar();
		System.out.println("La letra presiona es: " + letra + " con coidog " + codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) { }
}