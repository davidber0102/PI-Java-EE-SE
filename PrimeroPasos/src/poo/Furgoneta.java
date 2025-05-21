package poo;

public class Furgoneta extends Coche {
	private int capacidad_carga;
	private int plazas_extras;
	
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super();  ///llamar ala contructor de la calse padre
		this.capacidad_carga = 	capacidad_carga;
		this.plazas_extras = plazas_extra;
	}
	
	
	//metodo getter
	public String dimeDatosFurgoneta() {
		return " La capacidad de carga es " + capacidad_carga + " Y las plazas som: " + plazas_extras;
 	}
	

}
