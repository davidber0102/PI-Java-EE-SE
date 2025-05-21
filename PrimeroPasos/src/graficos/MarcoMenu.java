package graficos;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
public class MarcoMenu {

	public static void main(String[] args) {
		MenuFrame marco = new MenuFrame();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MenuFrame extends JFrame {
	public MenuFrame() {
		super();
		setVisible(true);
		setBounds(600, 200, 600, 300);
		setTitle("---Bienvenido a Java --- Menus---");	
		MenuLamina lamina = new MenuLamina();
		add(lamina);
	}
}

class MenuLamina extends JPanel{
	JTextPane areaText;
	public MenuLamina() {
		setLayout(new BorderLayout());	
		JMenuBar barraMenu = new  JMenuBar();
		JPanel laminaMenu = new JPanel();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/graficos/icons8-cortar-36.png") );
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/graficos/icons8-copiar-48.png"));
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/graficos/icons8-pegar-48.png"));
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		
		JMenuItem generales = new JMenuItem("Generales");
		herramientas.add(generales);
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		barraMenu.add(archivo);
		barraMenu.add(edicion);
		barraMenu.add(herramientas);
		
				
		laminaMenu.add(barraMenu);
		add(laminaMenu, BorderLayout.NORTH);
		areaText = new JTextPane();
		add( areaText, BorderLayout.CENTER);
	}
}