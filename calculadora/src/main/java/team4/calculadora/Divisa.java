package team4.calculadora;

public class Divisa {

	String id;
	String simbolo;
	String nombre;
	String pais;
	double valorDolar;
	
	
	public Divisa(String id, String simbolo, String nombre, String pais, double valorDolar) {
		this.id = id;
		this.simbolo = simbolo;
		this.nombre = nombre;
		this.pais = pais;
		this.valorDolar = valorDolar;
	}
	
	public String getId() {
		return id;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPais() {
		return pais;
	}

	public double getValorDolar() {
		return valorDolar;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}

	@Override
	public String toString() {
		return nombre;
	}
		
}
