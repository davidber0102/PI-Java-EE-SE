package PracticaGuida;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ProcesadorTextos2 {
	public static void main(String[] args) {
		MenuProcesador2 marco = new MenuProcesador2();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}
}

class MenuProcesador2 extends JFrame{
	public MenuProcesador2(){
		setVisible(true);
		setBounds(600, 300, 600, 400);
		setTitle("---Bienvenido Procesador de Textos---");	
		LaminaProcesador2 lamina = new LaminaProcesador2();
		add(lamina);	}
}

class LaminaProcesador2 extends JPanel{
	JTextPane areaText;
	JMenu fuente, estilo, tamanio;
	Font letras;
	public LaminaProcesador2() {
		setLayout(new BorderLayout());		
		JPanel laminaMenu = new JPanel();
		//----------------------------------------------------------------------
		JMenuBar barraMenu = new  JMenuBar();
		//----------------------------------------------------------------------
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamanio = new JMenu("Tamaño");	
		//----------------------------------------------------------------------
		configuraMenu2("Arial", "fuente", "Arial", 9 , 10 );
		configuraMenu2("Courier", "fuente", "Courier", 9 , 10 );
		configuraMenu2("Verdana", "fuente", "Verdana", 9 , 10 );
		//----------------------------------------------------------------------
		configuraMenu2("Negrita", "estilo", "", Font.BOLD , 1 );
		configuraMenu2("Cursiva", "estilo", "", Font.ITALIC , 1 );
		//----------------------------------------------------------------------
		configuraMenu2("12", "tamaño", "", 9 , 12 );
		configuraMenu2("18", "tamaño", "", 9 , 16 );
		configuraMenu2("20", "tamaño", "", 9 , 20);
		configuraMenu2("24", "tamaño", "", 9 , 24 );
		//----------------------------------------------------------------------
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tamanio);		
		//----------------------------------------------------------------------
		laminaMenu.add(barraMenu);
		add(laminaMenu, BorderLayout.NORTH);
		areaText = new JTextPane();
		add( areaText, BorderLayout.CENTER);	
	}
	
	public void configuraMenu2(String rotulo, String menu, String tipoLetra, int estilos, int tam){
		JMenuItem elemMenu = new JMenuItem(rotulo); 
		if(menu=="fuente") {
			fuente.add(elemMenu);
		}else if(menu=="estilo") {
			estilo.add(elemMenu);
		}else if(menu=="tamaño") {
			tamanio.add(elemMenu);
		}
		elemMenu.addActionListener(new GestionEventos2(rotulo,tipoLetra, estilos, tam ));
	}
	
	private class GestionEventos2 implements ActionListener{
		String tipoText, menu;
		int estiloLetra, tamLetra;
		
		GestionEventos2(String elemento, String texto2, int estilo2, int tamLetra2){
			tipoText= texto2;
			estiloLetra = estilo2;
			tamLetra = tamLetra2;
			menu = elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			letras= areaText.getFont();
			
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {
				estiloLetra=letras.getStyle();
				tamLetra = letras.getSize();
			} else if (menu=="Cursiva" || menu=="Negrita") {
				if(letras.getStyle() == 1 || letras.getStyle() == 2) {
					estiloLetra=3;
				}
				
				tipoText = letras.getFontName();
				tamLetra = letras.getSize();
			} else if(menu=="12" || menu=="16" || menu=="20" || menu=="24" ) {
				tipoText = letras.getFontName();
				estiloLetra=letras.getStyle();
			}
			
			areaText.setFont(new Font(tipoText, estiloLetra, tamLetra));
			System.out.println("Tipo: " + tipoText + "\nEstilo: "+ estiloLetra + "\nTamaño: " + tamLetra );
		}
	}
}