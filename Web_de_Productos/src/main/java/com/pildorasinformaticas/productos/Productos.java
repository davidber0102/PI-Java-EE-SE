package com.pildorasinformaticas.productos;

import java.util.Date;

public class Productos {
	public Productos(String cArt, String seccion, String nArt, double precio, String fecha, String importado,	String pOrigen) {
		this.cArt = cArt;
		this.seccion = seccion;
		this.nArt = nArt;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.pOrigen = pOrigen;
	}
	
	public Productos(String seccion, String nArt, double precio, String fecha, String importado, String pOrigen) {
		this.seccion = seccion;
		this.nArt = nArt;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.pOrigen = pOrigen;
	}

	public String getcArt() {
		return cArt;
	}

	public void setcArt(String cArt) {
		this.cArt = cArt;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getnArt() {
		return nArt;
	}

	public void setnArt(String nArt) {
		this.nArt = nArt;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha( String fecha) {
		this.fecha = fecha;
	}

	public String getImportado() {
		return importado;
	}

	public void setImportado(String importado) {
		this.importado = importado;
	}

	public String getpOrigen() {
		return pOrigen;
	}

	public void setpOrigen(String pOrigen) {
		this.pOrigen = pOrigen;
	}
	
	

	@Override
	public String toString() {
		return "Productos [cArt=" + cArt + ", seccion=" + seccion + ", nArt=" + nArt + ", precio=" + precio + ", fecha="
				+ fecha + ", importado=" + importado + ", pOrigen=" + pOrigen + "]";
	}



	// campos de base de datos
	// CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN, FOTO
	private String cArt;
	private String seccion;
	private String nArt;
	private double precio;
	private String fecha;
	private String importado;
	private String pOrigen;


}
