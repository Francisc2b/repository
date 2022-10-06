package com.curso.maquina;

import java.util.Objects;

public class Refresco {
	
	private int id;
	private String sabor;
	private int cl;
	private double precio;
	//private String agotado;
	private int stock;
	
	
	
	public Refresco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Refresco(int id, String sabor, int cl, double precio, int stock) {
		this.id = id;
		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cl, id, precio, sabor, stock);
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
		return cl == other.cl && id == other.id
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(sabor, other.sabor) && stock == other.stock;
	}

	@Override
	public String toString() {
		return "Refresco [id=" + id + ", sabor=" + sabor + ", cl=" + cl + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	
	

}
