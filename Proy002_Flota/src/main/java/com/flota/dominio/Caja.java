package com.flota.dominio;

public class Caja {

	private double peso;

	public Caja() {
		peso = 100.0;
	}

	public Caja(double peso) {
		super();
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		// TODO lo que sea
		if (peso <= 0) {
			throw new RuntimeException("La caja debe pesar algo");
		}
		
		this.peso = peso;
	}
	
	

}
