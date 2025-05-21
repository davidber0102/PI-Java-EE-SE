import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo acc = new Escribiendo();
		acc.escribir();
	}
}

class Escribiendo{
	public void escribir() {
		String frase = "Esto  es una prueba de escritura";
		try {
			FileWriter doc = new FileWriter("C:/Cursos/Java_Pildoras/Streams/src/ejemplo2.txt");			
			for(int i=0; i<frase.length(); i++) {
				doc.write(frase.charAt(i));
			}
			doc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}