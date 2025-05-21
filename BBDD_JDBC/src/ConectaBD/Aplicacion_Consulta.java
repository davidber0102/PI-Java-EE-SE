package ConectaBD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Aplicacion_Consulta {
	public static void main(String[] args) {		
		JFrame mimarco=new Marco_Aplicacion();		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mimarco.setVisible(true);
	}
}

class Marco_Aplicacion extends JFrame{	
	public Marco_Aplicacion(){		
		setTitle ("Consulta BBDD 1");		
		setBounds(500,300,400,400);		
		setLayout(new BorderLayout());		
		JPanel menus=new JPanel();		
		menus.setLayout(new FlowLayout());		
		secciones=new JComboBox();		
		secciones.setEditable(false);		
		secciones.addItem("Todos");		
		paises=new JComboBox();		
		paises.setEditable(false);
		paises.addItem("Todos");		
		resultado= new JTextArea(4,50);		
		resultado.setEditable(false);		
		add(resultado);		
		menus.add(secciones);		
		menus.add(paises);			
		add(menus, BorderLayout.NORTH);		
		add(resultado, BorderLayout.CENTER);		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ejecutaConsulta();
			}
		});
		
		
		add(botonConsulta, BorderLayout.SOUTH);		
		
		
		
		// ----------------------- CONEXION CON BBDD--------------------------------
		
		try {				
				Conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");				
				Statement st = Conex.createStatement();		
				// --- CARGA JCOMBOX SECCIONES
				String consulta = "SELECT DISTINCTROW NOMBRE_DEL_PRODUCTO FROM tabla_de_productos";
				ResultSet rs = st.executeQuery(consulta);						
					while(rs.next()) {
						secciones.addItem(rs.getString(1));
					}		
				rs.close();
				// -- CARGA JCOMBO PASISES
				consulta = "SELECT DISTINCTROW ENVASE FROM tabla_de_productos";
				rs = st.executeQuery(consulta);						
					while(rs.next()) {
						paises.addItem(rs.getString(1));
					}		
				rs.close();
			}catch(Exception e){
				System.out.println("NO CONECTA!!");
				e.printStackTrace();
			}

	}	
	
	private void ejecutaConsulta() {
		ResultSet rs = null;
		
		try {
			resultado.setText("");
			String seccion = (String) secciones.getSelectedItem();
			String pais =(String) paises.getSelectedItem();
			
			
			if(!seccion.equals("Todos") && pais.equals("Todos")) {			
				enviaConsultaSeccion = Conex.prepareStatement(consultaSeccion);
				enviaConsultaSeccion.setString(1, seccion);
				rs = enviaConsultaSeccion.executeQuery();
			}else if (seccion.equals("Todos") && !pais.equals("Todos")) {
				enviaConsultaPais = Conex.prepareStatement(consultaPais);
				enviaConsultaPais.setString(1, pais);
				rs = enviaConsultaPais.executeQuery();				
								
			}else if (!seccion.equals("Todos") && !pais.equals("Todos")) {
				enviaConsultaTodos = Conex.prepareStatement(consultaTodos);
				enviaConsultaTodos.setString(1, seccion);
				enviaConsultaTodos.setString(2, pais);
				rs = enviaConsultaTodos.executeQuery();	
				
			}
				while(rs.next()) {
					resultado.append(rs.getString(1));
					resultado.append(", ");
					
					resultado.append(rs.getString(2));
					resultado.append(", ");
					
					resultado.append(rs.getString(3));
					resultado.append(", ");
					
					resultado.append(rs.getString(4));
					resultado.append(", ");
					
					resultado.append(rs.getString(5));
					resultado.append(", ");
					
					resultado.append(rs.getString(6));		
					resultado.append("\n ");
					}		
				rs.close();
			
		}catch(Exception e){
			
		}
	}
	
	
	private Connection Conex;
	private PreparedStatement enviaConsultaSeccion;
	private PreparedStatement enviaConsultaPais;
	private PreparedStatement enviaConsultaTodos;
	private final String consultaSeccion = "SELECT * FROM tabla_de_productos WHERE NOMBRE_DEL_PRODUCTO = ? ";
	private final String consultaPais = "SELECT * FROM tabla_de_productos WHERE ENVASE = ? ";
	private final String consultaTodos = "SELECT * FROM tabla_de_productos WHERE NOMBRE_DEL_PRODUCTO = ? AND ENVASE = ? ";
	private JComboBox secciones;	
	private JComboBox paises;	
	private JTextArea resultado;	
}
