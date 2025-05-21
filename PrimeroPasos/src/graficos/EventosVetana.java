package graficos;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class EventosVetana {
	public static void main(String[] args) {
		MarcoVentana marco = new MarcoVentana();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Ventana 1");
		marco.setBounds(300, 300, 500, 350);		
		
		MarcoVentana marco2 = new MarcoVentana();	
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		marco2.setTitle("Ventana 2");
		marco2.setBounds(900, 300, 500, 350);
		
	}
}


class MarcoVentana extends JFrame{
	public MarcoVentana(){
		super();
		setVisible(true);
		//setBounds(750, 300, 500, 350);
		//setTitle("---Bienvenido a Java --- Marco con Eventos---");	
		
		//M_Ventama oyenteVentana = new M_Ventama();
		//addWindowListener(oyenteVentana);
		
		addWindowListener(new M_Ventama());

	}
}


class M_Ventama extends WindowAdapter{

	/*@Override
	public void windowOpened(WindowEvent e) {	
		System.out.println(" Se Inicio Ventana Activa");
	}

	@Override
	public void windowClosing(WindowEvent e) {	
		System.out.println(" Cerrando Ventana................");
	}

	@Override
	public void windowClosed(WindowEvent e) { 
		System.out.println(" Ventana ha sido Cerrada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) { 
		System.out.println("Se maximizo Ventana Activa");
	}

	@Override
	public void windowActivated(WindowEvent e) { 
		System.out.println(" Ventana Activada");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println(" Ventana Desactivada");
	}*/
	
	@Override
	public void windowIconified(WindowEvent e) { 
		System.out.println("Se minimizo Ventana Activa");
	}
	
}