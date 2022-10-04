package com.flota.dominio;

/**
 * Clase que representa un vehículo de una flota que puede transportar cajas
 * Pero tiene carga máxima permitida
 * 
 * @author Francis
 * @version 1.0
 * @
 *
 */

public class Vehiculo {
	
	private double cargaMaxima;
	
	private double cargaActual = 0;
	
	private String matricula;
	
	private int numCajas = 0;
	
	
	//public final double CARGA_MAXIMA_POR_DEFECTO = 5222.78;

//	public Vehiculo() {
//		super();
//		// TODO Auto-generated constructor stub
//	}	

	public Vehiculo(double cargaMaxima, String matricula) {
		//validar matricula no null
		//validar marga maxima >0
		
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
	}

	public Vehiculo(double cargaMaxima) {
		super();
		this.cargaMaxima = cargaMaxima;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		if(cargaMaxima < 0) {
			throw new RuntimeException("No puede pasar una carga máxima negativa");
		}
		
		this.cargaMaxima = cargaMaxima;
	}
	
	/**
	 * Método que reccibe el peso de la caja a cargar e incrementa el peso actual
	 * del camión y el número de cajas cargadas
	 * Sí el peso no es válido (<0) lanza una exception
	 * Si el peso a cargar supoer el max permitido exception
	 * @param peso peso de la caja a cargar en kg
	 * @throws RuntimeException el peso de la caja no es válido o supera
	 * la carga máxima permitida
	 */
	public void cargarCaja(double peso) {
		if (peso <= 0) {
			throw new RuntimeException("La caja debe pesar algo");
		}		
		
		if(peso + cargaActual <= cargaMaxima) {			
			throw new RuntimeException("no caben mas cajas");		
		}
		this.cargaActual +=peso;
		this.numCajas ++;
	}
	
	public void cargarCaja (Caja c) {
		cargarCaja(c.getPeso());
		
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public int getNumCajas() {
		return numCajas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

	
}
