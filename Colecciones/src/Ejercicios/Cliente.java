package Ejercicios;

import java.util.Objects;

public class Cliente {		
	public Cliente(String nombre, String noCuenta, double saldo) {
		super();
		this.nombre = nombre;
		this.noCuenta = noCuenta;
		this.saldo = saldo;	}
	
	public String getNombre() {
		return nombre;	}
	public void setNombre(String nombre) {
		this.nombre = nombre;	}
	public String getNoCuenta() {
		return noCuenta;	}
	public void setNoCuenta(String noCuenta) {
		this.noCuenta = noCuenta;	}
	public double getSaldo() {
		return saldo;	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(noCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(noCuenta, other.noCuenta);
	}



	private String nombre;
	private String noCuenta;
	private double saldo;

}
