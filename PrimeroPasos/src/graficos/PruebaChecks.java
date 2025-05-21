package graficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaChecks {
	public static void main(String[] args) {
		MarcoCheck marco = new MarcoCheck();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCheck extends JFrame{
	public MarcoCheck() {
		super();
		setVisible(true);
		setBounds(500, 300, 500, 400);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON check-");	
		LaminaCheck lamina = new LaminaCheck();
		add(lamina);
	}
}

class LaminaCheck extends JPanel{
	private JLabel texto;
	private JCheckBox check1, check2;
	
	public LaminaCheck(){
		setLayout(new BorderLayout());
		Font miLetra = new Font("Serif", Font.PLAIN, 24);
		texto = new JLabel("En un lugar de la Mancha de cuyo nonbre no quiero acordarme...");
		texto.setFont(miLetra);
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(texto);
		
		add(laminaTexto, BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminaCheck = new JPanel();
		laminaCheck.add(check1);
		laminaCheck.add(check2);
		
		add(laminaCheck, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipo, 24));

		}
	}
}