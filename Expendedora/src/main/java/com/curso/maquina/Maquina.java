package com.curso.maquina;

import java.util.Objects;

public class Maquina {
	
	private int caja;
	private int vendido;	
	private int vueltas;
	private Refresco refresco;
	
	public Maquina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Maquina(int caja, Refresco refresco) {
		super();
		this.caja = 0;
		this.vendido = vendido;
		this.vueltas = vueltas;
		this.refresco = refresco;
	}

	public int venta(int introducido ){
		
		if(this.refresco.sinStock()) {
			//sin Stock
			return 0;
		}
		
		int cambio = introducido - this.refresco.getPrecio();
		if(cambio < 0 ) {
			//sin vueltas suficientes
			return 1;
		}
		if(cambio > this.vueltas) {
			return 2;
		}	
		
		this.vendido ++;
		this.caja += this.refresco.getPrecio();
		this.refresco.vender();
		this.vueltas += this.refresco.getPrecio(); 		
		return cambio;
	}

	public int getCaja() {
		return caja;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public int getVendido() {
		return vendido;
	}

	public void setVendido(int vendido) {
		this.vendido = vendido;
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

	public Refresco getRefresco() {
		return refresco;
	}

	public void setRefresco(Refresco refresco) {
		this.refresco = refresco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caja, refresco, vendido, vueltas);
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
		return caja == other.caja && Objects.equals(refresco, other.refresco) && vendido == other.vendido
				&& vueltas == other.vueltas;
	}

	@Override
	public String toString() {
		return "Maquina [caja=" + caja + ", vendido=" + vendido + ", vueltas=" + vueltas + ", refresco=" + refresco
				+ "]";
	}

}
