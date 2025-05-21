package Modelo;

public class Productos {
	
	public Productos() {
		nomnre_del_producto = "";
		tamano = "";
		sabor = "";
		envase = "";
		precio_de_lista = "";
	}
	
	
	public String getNomProducto() {
		return nomnre_del_producto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomnre_del_producto = nomProducto;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getEnvase() {
		return envase;
	}
	public void setEnvase(String envase) {
		this.envase = envase;
	}
	public String getPrecioLista() {
		return precio_de_lista;
	}
	public void setPrecioLista(String precioLista) {
		this.precio_de_lista = precioLista;
	}


	private String nomnre_del_producto;
	private String tamano;
	private String sabor;
	private String envase;
	private String precio_de_lista;

}
