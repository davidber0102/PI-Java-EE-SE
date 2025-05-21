package ficheros_directorios;

import java.io.*;

public class Eliminando {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = File.separator;		
		File ruta = new File(".." + d + "Streams" + d +"ruta"+ d + "ejercicio.txt");
		ruta.delete();
	}

}
