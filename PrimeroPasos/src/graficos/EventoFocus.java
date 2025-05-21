package graficos;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFocus {

	public static void main(String[] args) {
		MarcoConFocus marco = new MarcoConFocus();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConFocus extends JFrame{

	public MarcoConFocus() throws HeadlessException {
		super();
		setVisible(true);
		setBounds(700, 300, 600, 750);
		setTitle("---Bienvenido a Java --- Marco con Uso de Teclas--");	
		add(new LaminaFoco());
		
	}
}

class LaminaFoco extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);
		
		add(cuadro1);
		add(cuadro2);
		
		EventoFoco nuevoFoco = new EventoFoco();
		cuadro1.addFocusListener(nuevoFoco);
		cuadro2.addFocusListener(nuevoFoco);
	}
	JTextField cuadro1;
	JTextField cuadro2;
	
	private class EventoFoco implements FocusListener{
		@Override
		public void focusGained(FocusEvent e) {
			//System.out.println("Has ganado el foco"  );
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			//System.out.println("Has perdido el foco");
			String email=cuadro1.getText();
			boolean comporbacion = false;
			
			for(int i=0; i<email.length(); i++) {
				if(email.charAt(i)=='@'){
					comporbacion = true;
				}
			}
			
			if(comporbacion) {
				System.out.println("Correcto");
			}else {
				System.out.println("Revisa tu informacion");
			}
			
		}
	}
}


