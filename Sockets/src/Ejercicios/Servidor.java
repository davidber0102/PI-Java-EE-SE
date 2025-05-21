package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;


public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

// video 193 minuto 15
class MarcoServidor extends JFrame implements Runnable {
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread h = new Thread(this);
		h.start();
		
		}
	
	
	@Override
	public void run() {
		 //System.out.println("Funciona");
		try {
			ServerSocket ss1 = new ServerSocket(9999);
			String nick, ip, mensaje;
			PaqueteEnvio paquete_recibido;
			while(true) {	
				Socket misocket = ss1.accept();
				
				ObjectInputStream paquete_datos = new ObjectInputStream(misocket.getInputStream());	
				paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();
				nick = paquete_recibido.getNick();
				ip = paquete_recibido.getIp();
				mensaje = paquete_recibido .getMensaje();
				/*DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());				
				String mensaje_txt = flujo_entrada.readUTF();				
				areatexto.append("\n" + mensaje_txt);*/
				areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
				Socket enviaDestinatario = new Socket(ip, 9090);
				ObjectOutputStream paqReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
				paqReenvio.writeObject(paquete_recibido);
				paqReenvio.close();
				enviaDestinatario.close();
				misocket.close();
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private	JTextArea areatexto;

}
