package ProcedAlmacenado;
import java.sql.*;

import javax.swing.JOptionPane;

public class ActualizaProductos {
	public static void main(String[] args) {
		float nPrecio = Float.parseFloat(JOptionPane.showInputDialog("Introduce precio Actualizado"));
		String nArticulo = JOptionPane.showInputDialog("Inttroduce Nombre de producto a Modificar");
		Connection Conex;
		 CallableStatement cst;
		 try {
				Conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/jugos_ventas", "root" , "dBd#C4rt0$202A");
				 cst = Conex.prepareCall("{call actualiza_prod(?,?)}");
				 cst.setFloat(1, nPrecio);
				 cst.setString(2, nArticulo);
				 
				  cst.execute();
				  System.out.println("Informacion Actualizada");
		 }catch (Exception e) {
				e.printStackTrace();
			}		


	}

}
