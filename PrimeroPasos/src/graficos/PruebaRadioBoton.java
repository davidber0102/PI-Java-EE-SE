package graficos;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class PruebaRadioBoton {
	public static void main(String[] args) {
		MarcoRadioButon marco = new MarcoRadioButon();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRadioButon extends JFrame{
	public MarcoRadioButon() {
		super();
		setVisible(true);
		setBounds(600, 300, 500, 400);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON RADIO BOTON-");	
		LaminaRadioBoton lamina = new LaminaRadioBoton();
		add(lamina);
	}
}

class LaminaRadioBoton extends JPanel{
	public LaminaRadioBoton() {
		ButtonGroup miGrupo1 = new ButtonGroup();
		JRadioButton btn1 = new JRadioButton("Azul", false);
		JRadioButton btn2 = new JRadioButton("Rojo", true);
		JRadioButton btn3 = new JRadioButton("Verde", false);
		
		miGrupo1.add(btn1);
		miGrupo1.add(btn2);
		miGrupo1.add(btn3);
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		
	}
}