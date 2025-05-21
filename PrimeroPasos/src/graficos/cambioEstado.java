package graficos;
import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class cambioEstado {
	public static void main(String[] args) {
		MarcoEstado marco = new MarcoEstado();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoEstado extends JFrame{
	public MarcoEstado(){
		super();
		setVisible(true);
		setBounds(300, 300, 500, 350);
		setTitle("---Bienvenido a Java --- Marco con cambio Estado--");		
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
	}
}

class CambiaEstado implements WindowStateListener{
	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println(" Ventana ha Cambiado de Estado");
		//System.out.println(e.getNewState());		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println(" Ventana esta en Pnatalla Completa");
		} else if(e.getNewState()==Frame.NORMAL) {
			System.out.println(" Ventana esta en Pnatalla Normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println(" Ventana esta en Pnatalla Minimizada");
		}
	}
	
}
