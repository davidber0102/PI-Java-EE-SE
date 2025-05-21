package Ejercicios;

import java.awt.event.*;

import java.io.*;

import javax.swing.*;
import java.net.*;

public class Cliente {
	public static void main(String[] args) {
		MarcoCliente mimarco=new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCliente extends JFrame{	
	public MarcoCliente(){		
		setBounds(600,300,280,350);				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();		
		add(milamina);		
		setVisible(true);
		}		
}

class LaminaMarcoCliente extends JPanel implements Runnable{	
	public LaminaMarcoCliente(){
		
		nick = new JTextField(5);	
		add(nick);
		
		JLabel texto=new JLabel("-----CHAT------ ");		
		add(texto);
		
		ip = new JTextField(8);
		add(ip);
		
		campochat = new JTextArea(12,20);
		add(campochat);
	
		campo1=new JTextField(20);	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		EnviaTexto ev = new EnviaTexto();
		miboton.addActionListener(ev);		
		add(miboton);	
		
		Thread mihilo = new Thread(this);
		mihilo.start();
	}
	
	private class EnviaTexto implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 //System.out.println(campo1.getText());
			
			campochat.append("\n" + campo1.getText() );
			
			
			
			try {
				Socket st = new Socket("10.10.0.111", 9999);
				
				PaqueteEnvio datos = new PaqueteEnvio();
				datos.setNick(nick.getText());
				datos.setIp(ip.getText());
				datos.setMensaje(campo1.getText());
				
				ObjectOutputStream paqueta_datos = new ObjectOutputStream(st.getOutputStream());
				paqueta_datos.writeObject(datos);
				paqueta_datos.close();
				/*DataOutputStream flujoSalida = new DataOutputStream(st.getOutputStream());
				flujoSalida.writeUTF(campo1.getText());
				flujoSalida.close();*/
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
		}
	}				
	private JTextField campo1, nick, ip;
	private	JTextArea campochat;
	private JButton miboton;
	@Override
	public void run() {
		
		try {
			ServerSocket ss2 = new ServerSocket(9090);
			Socket cliente;
			PaqueteEnvio paqueteRecibido;
			
				while(true) {
					cliente = ss2.accept();
					ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());	
					paqueteRecibido = (PaqueteEnvio) flujoEntrada.readObject();
					campochat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje() + " desde " + paqueteRecibido.getIp());
				}
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}

class PaqueteEnvio implements Serializable {	
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	private String nick, ip, mensaje;
}




