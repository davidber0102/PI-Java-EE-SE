package LeyendoEscribiendo_Bytes;
import java.io.*;

public class Lectura_escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador =0;
		int datos_entrada [] = new int[98130];
		
		try {
			FileInputStream arch_lec = new FileInputStream("src/LeyendoEscribiendo_Bytes/free.jpg"); 			
			boolean final_ar = false;
			
			while(!final_ar) {
				int byte_entrada = arch_lec.read();
				
				if(byte_entrada != -1)
					datos_entrada[contador] = byte_entrada;
			
				else
					final_ar = true;				
					System.out.println(datos_entrada[contador]);
					contador++;
			}
			arch_lec.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se enceuntra la imagen");
		}
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
	}

	static void crea_fichero(int datos_nuevo_fichero[]) {
		try {
			FileOutputStream arch_sal = new FileOutputStream("src/LeyendoEscribiendo_Bytes/free_copia.jpg");
			
			for(int i=0; i<datos_nuevo_fichero.length; i++) {
				arch_sal.write(datos_nuevo_fichero[i]);
			}
			arch_sal.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al crear la imagen");
		}
		
	}
	
	
}
