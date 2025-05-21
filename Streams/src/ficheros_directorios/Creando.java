package ficheros_directorios;
import java.io.*;
public class Creando {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = File.separator;		
		File ruta = new File(".." + d + "Streams" + d +"ruta"+ d + "ejercicio.txt");
		String achivo_destino = ruta.getAbsolutePath();
		//ruta.mkdir();
		try {
			ruta.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
		Escribiendo accede_es = new Escribiendo();
		accede_es.escribir(achivo_destino);	
	}
}

class Escribiendo{
	public void escribir(String ruta_archivo){
		String frase = "Esto es un ejemplo, espero que sañga";
		
		try {
			FileWriter escritura = new FileWriter(ruta_archivo);
			for(int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
