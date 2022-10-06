package com.curso.maquina;

import java.util.Objects;

public class Maquina {
	
	private int stockaje;
	private double caja;
	
	public Maquina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Maquina(int stockaje, double caja) {
		this.stockaje = stockaje;
		this.caja = caja;
	}

	public int getStockaje() {
		return stockaje;
	}

	public void setStockaje(int stockaje) {
		this.stockaje = stockaje;
	}

	public double getCaja() {
		return caja;
	}

	public void setCaja(double caja) {
		this.caja = caja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caja, stockaje);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maquina other = (Maquina) obj;
		return Double.doubleToLongBits(caja) == Double.doubleToLongBits(other.caja) && stockaje == other.stockaje;
	}

	@Override
	public String toString() {
		return "Maquina [stockaje=" + stockaje + ", caja=" + caja + "]";
	}
	
	
	

}
