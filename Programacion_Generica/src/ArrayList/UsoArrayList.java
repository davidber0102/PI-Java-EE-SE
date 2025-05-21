package ArrayList;
import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList archivos = new ArrayList(4);
		archivos.add("Juan");
		archivos.add("David");
		archivos.add("Jose");
		archivos.add("Antonio");
		
		String nombrePersona = (String)archivos.get(2);
		System.out.println(nombrePersona);

	}

}
