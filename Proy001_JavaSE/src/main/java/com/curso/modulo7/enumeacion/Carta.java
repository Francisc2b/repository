package com.curso.modulo7.enumeacion;

public class Carta {
	
	private Palos palo;
	private int valor;
	
	public Carta(Palos palo, int valor) {
		this.palo = palo;
		this.valor = valor;
	}

	public Palos getPalo() {
		return palo;
	}

	public void setPalo(Palos palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
