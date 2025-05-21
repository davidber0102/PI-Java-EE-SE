package ficheros_directorios;
import java.io.*;
public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = File.separator;
		
		File ruta = new File(".." + d + "Streams" + d +"ruta");
		
		System.out.println(ruta.getAbsolutePath());
		
		String [] nombres_archivos = ruta.list();
		
		for(int i=0; i<nombres_archivos.length; i++) {
			System.out.println(nombres_archivos[i]);
			
			File f = new File(ruta.getAbsolutePath(), nombres_archivos[i]);
			
			if(f.isDirectory()) {
				String [] archivos_sub = f.list();
				
				for(int j=0; j<archivos_sub.length;j++) {
					System.out.println(archivos_sub[j]);
				}
			}
		}

	}

}