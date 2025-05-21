package graficos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
public class PruebaTexto2 {
	public static void main(String[] args) {
		MarcoPruebaTexto2 marco = new MarcoPruebaTexto2();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPruebaTexto2 extends JFrame{
	public MarcoPruebaTexto2(){
		super();
		setVisible(true);
		setBounds(500, 300, 500, 500);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON TEXTOS--");	
		LaminaPruebaTexto lamina = new LaminaPruebaTexto();
		add(lamina);
	}
}

class LaminaPruebaTexto extends JPanel{
	public LaminaPruebaTexto() {
		super();
		JTextField campo2 = new JTextField(25);
		
		escuchaTexto elEvento = new escuchaTexto();
		
		Document miDoc = campo2.getDocument();
		miDoc.addDocumentListener(elEvento);
		
		add(campo2);
	}
	
	private class escuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
	}
}