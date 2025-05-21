package PracticaGuida;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.*;

public class ProcesadorTextos {
	public static void main(String[] args) {
		MenuProcesador marco = new MenuProcesador();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}
}

class MenuProcesador extends JFrame{
	public MenuProcesador(){
		setVisible(true);
		setBounds(600, 300, 600, 400);
		setTitle("---Bienvenido Procesador de Textos---");	
		LaminaProcesador lamina = new LaminaProcesador();
		add(lamina);	}
}

class LaminaProcesador  extends JPanel{
	JTextPane areaText;
	JMenu fuente, estilo, tamanio;
	Font letras;
	public LaminaProcesador() {
		setLayout(new BorderLayout());		
		JPanel laminaMenu = new JPanel();
		//----------------------------------------------------------------------
		JMenuBar barraMenu = new  JMenuBar();
		//----------------------------------------------------------------------
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamanio = new JMenu("Tamaño");	
		//----------------------------------------------------------------------
		configuraMenu("Arial", "fuente", "Arial", 9 , 10, " " );
		configuraMenu("Courier", "fuente", "Courier", 9 , 10, " " );
		configuraMenu("Verdana", "fuente", "Verdana", 9 , 10 , " ");
		//----------------------------------------------------------------------
		configuraMenu("Negrita", "estilo", "", Font.BOLD , 1 , "src/graficos/icons8-negrita-48.png ");
		//JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/icons8-negrita-48.png"));
		//negrita.addActionListener(new StyledEditorKit.BoldAction());
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC , 1 , "src/graficos/icons8-cursiva-48.png");
		//JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/icons8-cursiva-48.png"));
		//cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		//estilo.add(negrita);
		//estilo.add(cursiva);
		//----------------------------------------------------------------------
		/*configuraMenu("12", "tamaño", "", 9 , 12, " " );
		configuraMenu("18", "tamaño", "", 9 , 16 , " ");
		configuraMenu("20", "tamaño", "", 9 , 20, " ");
		configuraMenu("24", "tamaño", "", 9 , 24 , " ");*/
		
		ButtonGroup tamLetra = new ButtonGroup();
		JRadioButtonMenuItem tam12 = new JRadioButtonMenuItem("12", new ImageIcon("sicons8-altura-del-texto-48.png"));
		tam12.addActionListener(new StyledEditorKit.FontSizeAction("tam_12", 12));
		JRadioButtonMenuItem tam18 = new JRadioButtonMenuItem("18", new ImageIcon("sicons8-altura-del-texto-48.png"));
		tam18.addActionListener(new StyledEditorKit.FontSizeAction("tam_12", 18));
		JRadioButtonMenuItem tam20 = new JRadioButtonMenuItem("20", new ImageIcon("sicons8-altura-del-texto-48.png"));
		tam20.addActionListener(new StyledEditorKit.FontSizeAction("tam_12", 20));
		JRadioButtonMenuItem tam24 = new JRadioButtonMenuItem("24", new ImageIcon("sicons8-altura-del-texto-48.png"));
		tam24.addActionListener(new StyledEditorKit.FontSizeAction("tam_12", 24));
		//tam24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.META_DOWN_MASK));
		
		
		tamLetra.add(tam12);
		tamLetra.add(tam18);
		tamLetra.add(tam20);
		tamLetra.add(tam24);
		
		tamanio.add(tam12);
		tamanio.add(tam18);
		tamanio.add(tam20);
		tamanio.add(tam24);
		
		//----------------------------------------------------------------------
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tamanio);		
		//----------------------------------------------------------------------
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE =new JMenuItem("Negrita");
		JMenuItem cursivaE =new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaE);
		emergente.add(cursivaE);
		//-----------------
		laminaMenu.add(barraMenu);
		add(laminaMenu, BorderLayout.NORTH);
		areaText = new JTextPane();
		areaText.setComponentPopupMenu(emergente);
		add( areaText, BorderLayout.CENTER);	
		
		//Construccion de la barra de herramientas
		JToolBar barra = new JToolBar();
		JButton negritaBarra = new JButton( new ImageIcon("src/graficos/icons8-negrita-48.png"));
		JButton cursivaBarra = new JButton( new ImageIcon("src/graficos/icons8-cursiva-48.png"));
		JButton subrayarBarra = new JButton( new ImageIcon("src/graficos/subrayar.png"));
		
		JButton amarilloBarra = new JButton( new ImageIcon("src/graficos/amarillo.png"));
		JButton azulBarra = new JButton( new ImageIcon("src/graficos/azul.png"));
		JButton rojorBarra = new JButton( new ImageIcon("src/graficos/rojo.png"));
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subrayarBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
		rojorBarra.addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));
		
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subrayarBarra);
		barra.addSeparator();
		barra.add(amarilloBarra);
		barra.add(azulBarra);
		barra.add(rojorBarra);
		barra.setOrientation(1);
		
		add(barra, BorderLayout.EAST);

		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String rutaIcono){
		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(rutaIcono)); 
		if(menu=="fuente") {
			fuente.add(elemMenu);
			if(tipoLetra=="Arial") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("letra", "Arial"));
			}else if(tipoLetra=="Courier") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("letra", "Courier"));
			}else if(tipoLetra=="Verdana") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("letra", "Verdana"));
			}
		}else if(menu=="estilo") {
				estilo.add(elemMenu);
				if(estilos==Font.BOLD) {
					elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
					elemMenu.addActionListener(new StyledEditorKit.BoldAction());
				}else if (estilos==Font.ITALIC) {
					elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
					elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
				}			
		}else if(menu=="tamaño") {
			tamanio.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
		}
	}
}