package graficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadioBoton2 {
	public static void main(String[] args) {
			MarcoRadioBoton2 marco = new MarcoRadioBoton2();	
			marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	class MarcoRadioBoton2 extends JFrame{
		public MarcoRadioBoton2() {
			super();
			setVisible(true);
			setBounds(600, 300, 500, 400);
			setTitle("---Bienvenido a Java --- TRABAJANDO CON RADIO BOTON-");	
			LaminaRadioEjemplo2 lamina = new LaminaRadioEjemplo2();
			add(lamina);
		}
	}

	class LaminaRadioEjemplo2 extends JPanel{
		private JLabel texto;
		private JRadioButton btn1, btn2, btn3, btn4;
		private ButtonGroup miGrupo;
		private JPanel laminaRadio;
		public LaminaRadioEjemplo2() {
			setLayout(new BorderLayout());	
			texto = new JLabel("En un lugar de la Mancha de cuyo nonbre no quiero acordarme...");
			texto.setFont(new Font("Serif", Font.PLAIN, 12));
			add(texto, BorderLayout.CENTER);	
			
			laminaRadio = new JPanel();
			miGrupo = new ButtonGroup();
			
			colocarBotones("Pequeño", false, 10);
			colocarBotones("Mediano", true, 12);
			colocarBotones("Grande", false, 18);
			colocarBotones("Muy Grande", false, 24);
			
			add(laminaRadio, BorderLayout.SOUTH);
		}
		
		public void colocarBotones (String nombre, boolean selecionado, final int tamanio) {
			JRadioButton btn = new JRadioButton(nombre, selecionado); 
			miGrupo.add(btn);
			laminaRadio.add(btn);
			ActionListener miEvento = new ActionListener() {@Override	public void actionPerformed(ActionEvent e) {texto.setFont( new Font("Serif", Font.PLAIN, tamanio));		}	};
			
			btn.addActionListener(miEvento);
			
			
		}
	}

