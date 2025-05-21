package Practicas;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;


public class Marco_Dialogos extends JFrame {		
		public Marco_Dialogos(){
		setTitle("---Prueba de dialogos---");
		setBounds(500, 300, 600, 450);
		setVisible(true);	
		JPanel lamina_cuadricula = new JPanel();
		lamina_cuadricula.setLayout(new GridLayout(2,3));		
		
		String primero[] = {"Mensaje", "Confirmar", "Opciones", "Entrada"};
		lamin_tipo= new Lamina_Botones("Tipo", primero);
		
		lamin_tMsjs = new Lamina_Botones("Tipo de Mensajes", new String [] {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE" });
		lamin_msj = new Lamina_Botones("Mensajes", new String [] {"Cadena", "Icono", "Componente", "Otros", "Object []" });
		lamin_confirm = new Lamina_Botones("Confirmar", new String [] {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" });
		lamin_opciones = new Lamina_Botones("Opciones", new String [] {"String []", "Icono []", "Object []" });
		lamin_entrada = new Lamina_Botones("Entrada", new String [] {"Campo de texto", "Combo"});
		
		setLayout(new BorderLayout() );		
		
		lamina_cuadricula.add(lamin_tipo);
		lamina_cuadricula.add(lamin_tMsjs);
		lamina_cuadricula.add(lamin_msj);
		lamina_cuadricula.add(lamin_confirm);
		lamina_cuadricula.add(lamin_opciones);
		lamina_cuadricula.add(lamin_entrada);
		
		//construccion lamina inferion
		JPanel lamina_mostrar = new JPanel();
		JButton boton_mostrar = new JButton("Mostrar"); 
		
		boton_mostrar.addActionListener(new AccionMostrar());
		
		lamina_mostrar.add(boton_mostrar);
		
		add(lamina_mostrar, BorderLayout.SOUTH);
		add(lamina_cuadricula, BorderLayout.CENTER);	
}
// -------------------------------------------------Proporciana el mensaje 	------------------------------------------------------------------
		public Object dameMensaje() {
			//lamin_msj
			String s = lamin_msj.dameSeleccion();
			if(s.equals("Cadena")) {
				return cadenaMensaje;
			}else if(s.equals("Icono")) {
				return iconoMensaje;
			}else if(s.equals("Componente")) {
				return componetMensaje;
			}else if(s.equals("Otros")) {
				return objetoMensaje;
			} else if (s.equals("Object []")) {
				return new Object[] {cadenaMensaje, iconoMensaje, componetMensaje, objetoMensaje};
			}else {
				return null;
			}
		}
// -----------------------DEVUELVE TIPO ICONO Y OPCIONES DEL BOTON CONFIRMAR------------------------------------------------------------------------------------------------------//
		public int dameTipo(Lamina_Botones lamina) {
			String s = lamina.dameSeleccion();
			if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){
				return 0;
			}else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
				return 1;
			}else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
				return 2;
			}else if(s.equals("QUESTION_MESSAGE")) {
				return 3;
			}else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
				return -1;
			}else {
				return 0;
			}
		}	
		// ------------------------------------OPCIONES PARA LA LAMINA OPCIONES----------------------------------------------------------------------------------------
		public Object [] dameOpciones(Lamina_Botones lamina) {
			String s = lamina.dameSeleccion();
			
			if(s.equals("String []")) {
				return new String[]{"Amarillo", "Azul", "Rojo" };
			}else if(s.equals("Icono []")) {
				return new Object[]{ new ImageIcon("src/graficos/amarillo.png"), new ImageIcon("src/graficos/azul.png"), new ImageIcon("src/graficos/rojo.png") };
			}else if(s.equals("Object []")) {
				return new Object[] {cadenaMensaje, iconoMensaje, componetMensaje, objetoMensaje};
			}else {
				return null;
			}
		}
		
// ----------------------------------------------------------------------------------------------------------------------------
		private class AccionMostrar implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Funciona");
				//System.out.println(lamin_tipo.dameSeleccion());
				
				if(lamin_tipo.dameSeleccion().equals("Mensaje")) {
					JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamin_tMsjs));
				}else if (lamin_tipo.dameSeleccion().equals("Confirmar")){
					JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamin_confirm), dameTipo(lamin_tMsjs));
				}else if (lamin_tipo.dameSeleccion().equals("Entrada")){
					if(lamin_entrada.dameSeleccion().equals("Campo de texto")) {
						JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamin_tMsjs) );
					}else {
						JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamin_tMsjs), null, new String[]{"Amarillo", "Azul", "Rojo" }, "Azul");
					}
				}else if (lamin_tipo.dameSeleccion().equals("Opciones")){
					JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 1, dameTipo(lamin_tMsjs), null, dameOpciones(lamin_opciones), null);
				}				
			}		
		}		
	
	private Lamina_Botones lamin_tipo, lamin_tMsjs, lamin_msj, lamin_confirm, lamin_opciones, lamin_entrada;
	
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje =  new ImageIcon("src/graficos/azul.png");
	private Object objetoMensaje = new Date();	
	private Component componetMensaje = new Lamina_Ejemplo();
	
	class Lamina_Ejemplo extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			Rectangle2D rectan = new Rectangle2D.Double(0,0, getWidth(), getHeight());
			g2.setPaint(Color.YELLOW);
			g2.fill(rectan);
		}
	}
	
}
