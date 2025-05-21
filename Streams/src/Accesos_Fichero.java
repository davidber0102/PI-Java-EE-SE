import java.io.*;

public class Accesos_Fichero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();
	}
}

class Leer_Fichero{
	public void lee() {
		FileReader entrada = null;
		try {
			entrada = new FileReader("C:/Cursos/Java_Pildoras/Streams/src/ejemplo.txt");	
			BufferedReader filtro = new BufferedReader(entrada);
			String linea ="";
			//int c = 0;			
			while(linea != null ) {
				linea = filtro.readLine();
				
				//c= entrada.read();
				//char letra = (char) c;
				if(linea != null) 
					System.out.println(linea);
			}			
			//entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se ha encontrado el archivo");
		}finally {
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}