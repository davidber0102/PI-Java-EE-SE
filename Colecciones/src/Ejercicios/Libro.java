package Ejercicios;

import java.util.Objects;

public class Libro {	
	public Libro(String titulo, String autor, int iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
	}
	
	
	
	public String getDatos() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + "]";
	}

/*	public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro o1 = (Libro)obj;
			if(this.ISBN == o1.ISBN){
					return true;
				}else{
					return false;
				}
		}else {
			return false;
		}
			
}*/
	
	public String getTitulo() {
		return titulo;	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;	}
	
	public String getAutor() {
		return autor;	}
	
	public void setAutor(String autor) {
		this.autor = autor;	}
	
	public int getISBN() {
		return ISBN;	}
	
	public void setISBN(int iSBN) {
		ISBN = iSBN;	}

	private String titulo;
	private String autor;
	private int ISBN;

}
