package com.flota.dominio;

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
