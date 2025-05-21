package App_FinalJDBC;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AppGral {
	public static void main(String[] args) {
		MarcoBBDD m = new MarcoBBDD();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		m.setVisible(true);
	}
}

class MarcoBBDD extends JFrame{
	public MarcoBBDD() {
		setTitle ("Aplicacion JDBC");		
		setBounds(300,300,700,700);	
		LaminaBBDD ml = new LaminaBBDD();
		add(ml);
	}
}

class LaminaBBDD extends JPanel{
	public LaminaBBDD() {
		setLayout(new BorderLayout());	
		comboTablas = new JComboBox();	
		areaInfo = 	new JTextArea();
		conectarBBDD();
		obtenerTablas();
		comboTablas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombreTabla = (String) comboTablas.getSelectedItem();	
				mostrarInfoTabla(nombreTabla);
			}
		});
		
		add(comboTablas, BorderLayout.NORTH);		
		add(areaInfo, BorderLayout.CENTER);
		
		 		
	}
	
	public void conectarBBDD() {
		String datos[] = new String [3];
		try {			
			entrada = new FileReader("C:/Users/david.bernal/Desktop/d_config.txt");
			
		}catch(IOException e1 ) {
			 JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "File Texto", "txt", "csv");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(this);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	try {
						entrada = new FileReader(chooser.getSelectedFile().getAbsolutePath());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			      // System.out.println("You chose to open this file: " +
			        //    chooser.getSelectedFile().getAbsolutePath());
			    }
		}
		
		try {
			BufferedReader bfrr = new BufferedReader(entrada);
			
			for(int i=0; i<=2; i++ ) {
				datos[i] = bfrr.readLine();
			}
			
			// miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaspi", "root" , "dBd#C4rt0$202A");
			miConexion=DriverManager.getConnection(datos[0], datos[1], datos[2]);
			entrada.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	public void obtenerTablas() {
		try {
			datos = miConexion.getMetaData();
			rs =  datos.getTables("pruebaspi", null, null, null);
			
			while(rs.next()) {				
				System.out.println("--- " + rs.getString("TABLE_NAME"));
				comboTablas.addItem(rs.getString("TABLE_NAME"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarInfoTabla(String nomTabla) {
		ArrayList<String> campos = new ArrayList<String>();
		String consulta = "SELECT * FROM " + nomTabla;
		
		try {
			areaInfo.setText("");
			st = miConexion.createStatement();
			rs2 = st.executeQuery(consulta);	
			rsmd = rs2.getMetaData();
		    for(int i=1; i<=rsmd.getColumnCount(); i++) {
		    	campos.add(rsmd.getColumnLabel(i));
		    }
		    
		    while(rs2.next()) {
		    	for(String nombreCampo: campos) {
		    		areaInfo.append(rs2.getString(nombreCampo) + " ");
		    	}
		    	areaInfo.append("\n");
		    }			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	private JComboBox comboTablas;
	private JTextArea areaInfo;
	private Connection miConexion = null;
	private ResultSet rs = null;
	private ResultSet rs2;
	private DatabaseMetaData datos;
	private Statement st;
	private ResultSetMetaData rsmd;
	private FileReader entrada;
}