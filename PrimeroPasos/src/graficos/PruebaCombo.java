package graficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {
	public static void main(String[] args) {
		MarcoCombo marco = new MarcoCombo();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCombo extends JFrame{
	public MarcoCombo() {
		super();
		setVisible(true);
		setBounds(600, 200, 600, 300);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON COMBO---");	
		LaminaCombo lamina = new LaminaCombo();
		add(lamina);
	}
}

class LaminaCombo extends JPanel{
	private JLabel texto;
	private JComboBox miCombo;	
	public LaminaCombo(){
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nonbre no quiero acordarme...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		
		JPanel laminaNorte = new JPanel();
		miCombo = new JComboBox();
		miCombo.setEditable(true);
		miCombo.addItem("Serif");
		miCombo.addItem("SansSerif");
		miCombo.addItem("Monospaced");
		miCombo.addItem("Dialog");
		
		EventoCombo evento1 = new EventoCombo();
		miCombo.addActionListener(evento1);
		
		laminaNorte.add(miCombo);
		add(laminaNorte, BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setFont( new Font((String) miCombo.getSelectedItem(), Font.PLAIN, 18));
		}
		
	}
}