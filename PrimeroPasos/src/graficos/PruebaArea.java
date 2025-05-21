package graficos;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class PruebaArea {
	public static void main(String[] args) {
		MarcoPruebaArea marco = new MarcoPruebaArea();	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPruebaArea extends JFrame{
	private JPanel laminaBotones;
	private JButton btnInserter, btnSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
	public MarcoPruebaArea() {
		super();
		setVisible(true);
		setBounds(500, 300, 500, 400);
		setTitle("---Bienvenido a Java --- TRABAJANDO CON CAMPO DE area de texto--");	
		
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		btnInserter = new JButton("Insertar");
		
		btnInserter.addActionListener(new ActionListener() {@Override	public void actionPerformed(ActionEvent e) {areaTexto.append("En un lugar de la Mancha de cuyo nonbre no quiero acordarme...");} });
		laminaBotones.add(btnInserter);
		
		btnSaltoLinea = new JButton("Salto Linea");
		btnSaltoLinea.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean saltar = !areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				/*if(saltar) {btnSaltoLinea.setText("Quitar Salto");
				}else {	btnSaltoLinea.setText("Salto Linea");}*/
				btnSaltoLinea.setText(saltar? "Quita Salto" : "Salto Linea");
			} });
		
		laminaBotones.add(btnSaltoLinea);		
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
}