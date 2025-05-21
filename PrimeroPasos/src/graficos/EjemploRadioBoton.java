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

public class EjemploRadioBoton {
	public static void main(String[] args) {
		MarcoRadioBoton marco = new MarcoRadioBoton();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoRadioBoton extends JFrame{
	public MarcoRadioBoton() {
		super();
		setVisible(true);
		setBounds(600, 300, 500, 400);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON RADIO BOTON-");	
		LaminaRadioEjemplo lamina = new LaminaRadioEjemplo();
		add(lamina);
	}
}

class LaminaRadioEjemplo extends JPanel{
	private JLabel texto;
	private JRadioButton btn1, btn2, btn3, btn4;
	
	public LaminaRadioEjemplo() {
		setLayout(new BorderLayout());	
		texto = new JLabel("En un lugar de la Mancha de cuyo nonbre no quiero acordarme...");
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup miGrupo1 = new ButtonGroup();
		btn1 = new JRadioButton("Pequeño", false);
		btn2 = new JRadioButton("Mediano", true);
		btn3 = new JRadioButton("Grande", false);
		btn4 = new JRadioButton("Muy Grande", false);
		
		JPanel laminaRadio = new JPanel();
		EventoRadio miEvento = new EventoRadio();
		
		btn1.addActionListener(miEvento);
		btn2.addActionListener(miEvento);
		btn3.addActionListener(miEvento);
		btn4.addActionListener(miEvento);
		
		miGrupo1.add(btn1);
		miGrupo1.add(btn2);
		miGrupo1.add(btn3);
		miGrupo1.add(btn4);
		
		laminaRadio.add(btn1);
		laminaRadio.add(btn2);
		laminaRadio.add(btn3);
		laminaRadio.add(btn4);
		
		add(laminaRadio, BorderLayout.SOUTH);
		
	}
	
	private class EventoRadio implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1) {			
				texto.setFont( new Font("Serif", Font.PLAIN, 10));
			}else if(e.getSource() == btn2) {				
				texto.setFont( new Font("Serif", Font.PLAIN, 12));
			}else if(e.getSource() == btn3) {				
				texto.setFont( new Font("Serif", Font.PLAIN, 18));
			}else if(e.getSource() == btn4) {			
				texto.setFont( new Font("Serif", Font.PLAIN, 24));
			}
			
			
			
		}
		
	}
}