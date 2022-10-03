package com.flota.pruebas;

import com.flota.dominio.Vehiculo;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Vehiculo camion = new Vehiculo();
		 try {

				camion.setCargaMaxima(-5555);
				
		} catch (Exception e) {
			System.out.println("No pudo cargar " + e.getMessage());
		}
		
	}

}
