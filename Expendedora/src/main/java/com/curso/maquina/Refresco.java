package com.curso.maquina;

import java.util.Objects;

public class Refresco {
	
	
	private String sabor;
	private int cl;
	private int precio;
	private int stock;
	
	public Refresco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Refresco(String sabor, int cl, int precio, int stock) {
		super();
		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.stock = stock;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getCl() {
		return cl;
	}

	public void setCl(int cl) {
		this.cl = cl;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public boolean sinStock() {
		return this.stock == 0;
	}
	
	public boolean vender() {
		boolean stck = false;
		if (!this.sinStock()) {
			stck = true;
		}
		return stck;
	}
	
	public void reponer(int numero) {
		this.stock += numero;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(cl, precio, sabor, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refresco other = (Refresco) obj;
		return cl == other.cl && precio == other.precio && Objects.equals(sabor, other.sabor) && stock == other.stock;
	}

	@Override
	public String toString() {
		return "Refresco [sabor=" + sabor + ", cl=" + cl + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
}
