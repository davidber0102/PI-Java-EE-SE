package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		ruedas=4;
		largo = 2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}

	public String dimeDatosGenerales() { // metedo getter
		return "La plataforma del vehiculo tiene "
				+ ruedas + " ruedas " 
				+ ". Mide " + largo/1000 
				+ " metros con un ancho " + ancho
				+ "cm y con un peso de plataforma de " 
				+ pesoPlataforma + "kg \n";
		
	}

	public void setColor(String color) { //metodo setter
		//color = "Azul";  no devuelve dato, solo lo modifica
		this.color = color;
		
	}
	
	public String getColor() {
		return "El color del coche es: " + color; 
	}
	public void setAsientos_cuero(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {			this.asientos_cuero=false;		}
	}//configura asientos  setter

	public String dimeAsientos_cuero() {
		if(asientos_cuero) {
			return "El coche tiene asientos de cuero";
		}else {		
			return "El coche NO tiene asientos de cuero";		
			}
	} //GETTER
	
	public void configura_climatizador(String climatizador){
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	} //setter
	
	public String dimeClimatizador() {
		if(climatizador) {
			return "El coche incorpora Climatizador";
		}else {
			return "El coche lleva aire acomdicionado";
		}
	}//getter
	
	public String dimePesoCoche(){
		int peso_carroceria = 500;
		peso_total = pesoPlataforma + peso_carroceria;
		
		if(asientos_cuero) {
			peso_total = peso_total + 50;
		}
		if(climatizador) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es: " + peso_total;
		
	} //getter and setter
	//se hacen dos cosas, se estable el valor de una variable(getter)
	// y por otro lado devuelve un dato(setter)
	
	
	public int precio_coche() {
		int precio_final= 10000;
		
		if(asientos_cuero) {
			precio_final+=2000;
		}
		if(climatizador) {
			precio_final+=1000;
		}
		return precio_final;
	}
	
	
	
	
	

}
