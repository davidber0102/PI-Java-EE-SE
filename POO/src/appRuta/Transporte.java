package appRuta;

public class Transporte {
	private int id;
	private double coste;
	private int tiempo;
	
	// generados automaticamete por el IDE
	
	public int getId() { 		return id;	}
	
	public void setId(int id) {		this.id = id; 	}
	
	public double getCoste() {		return coste;	}
	
	public void setCoste(double coste) {		
		this.coste =  calculoCosteTaxi() + calculoCosteMetro() ;	}
	
	public int getTiempo() {		return tiempo;	}
	
	public void setTiempo(int tiempo) {		this.tiempo = tiempo;	}
	
	private double calculoCosteTaxi() {
		// realiza calculos
		return 40.0;
	}
	
	private double calculoCosteMetro() {
		// calculos
		return 5.0;
		
	}
	
	
		
	/* realizados manualemete
	void reservar() {		System.out.println("Reserva realizada");		}
	
	void setCoste() {		// calculos complejos				coste=45;	}
	
	double getCoste() {		return coste;	}*/
	
	/*double calcualCoste() {
		// calculos complejos
		coste=45;
		return coste;
	}*/

}
