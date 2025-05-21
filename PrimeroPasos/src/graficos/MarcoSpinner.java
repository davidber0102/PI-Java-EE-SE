package graficos;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class MarcoSpinner {
	public static void main(String[] args) {
		SpinnerMarco marco = new SpinnerMarco();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class SpinnerMarco extends JFrame{
	public SpinnerMarco() {
		super();
		setVisible(true);
		setBounds(600, 200, 600, 300);
		setTitle("---Bienvenido a Java --- TRABAJANDO SPINNER---");	
		LaminaSpinner lamina = new LaminaSpinner();
		add(lamina);
	}
}

class LaminaSpinner extends JPanel{
	public LaminaSpinner(){
		//String lista[]= {"Enero", "Febrero", "Marzo", "Abri", "Mayo"};
		//String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//JSpinner control = new JSpinner(new SpinnerListModel(lista));
		JSpinner control = new JSpinner(new ModeloSpinner());
		
		Dimension d = new Dimension(200, 20);
		control.setPreferredSize(d);		
		
		add(control);
	}
	private class ModeloSpinner extends SpinnerNumberModel{
		public ModeloSpinner() {
			super(5,0, 10, 1);
		}
		
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
}