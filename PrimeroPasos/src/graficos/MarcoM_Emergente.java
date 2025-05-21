package graficos;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MarcoM_Emergente {
	public static void main(String[] args) {
		MarcoEmergenteM marco = new MarcoEmergenteM();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEmergenteM extends JFrame{
	public MarcoEmergenteM(){
		super();
		setVisible(true);
		setBounds(100, 100, 300, 300);
		setTitle("---Bienvenido a Java --- Menus Emerergentes---");	
		LaminaEmergenteM lamina = new LaminaEmergenteM();
		add(lamina);
	}
}

class LaminaEmergenteM extends JPanel{
	JTextPane areaText;
	public LaminaEmergenteM() {
		setLayout(new BorderLayout());	
		JMenuBar barraMenu = new  JMenuBar();
		JPanel laminaMenu = new JPanel();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem opcion1 =new JMenuItem("Opcion1");
		JMenuItem opcion2 =new JMenuItem("Opcion2");
		JMenuItem opcion3 =new JMenuItem("Opcion3");
		
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		
	
		
		barraMenu.add(archivo);
		barraMenu.add(edicion);
		barraMenu.add(herramientas);
		
				
		laminaMenu.add(barraMenu);
		add(laminaMenu, BorderLayout.NORTH);
		areaText = new JTextPane();
		areaText.setComponentPopupMenu(emergente);
		add( areaText, BorderLayout.CENTER);
		
	}
}