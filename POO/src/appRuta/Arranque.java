package appRuta;

public class Arranque {

	public static void main(String[] args) {
		Transporte transporteLunes = new Transporte();
		transporteLunes.setCoste(20);
		System.out.println("El coste del viaje es: " + transporteLunes.getCoste());
		//transporteLunes.coste =125;
		//System.out.println("El coste del viaje es: " + transporteLunes.coste);

	}

}
