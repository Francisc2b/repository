package com.flota.pruebas;

import com.flota.dominio.Vehiculo;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Vehiculo camion = new Vehiculo( 500.10, "2345jjj");
		 try {

				camion.setCargaMaxima(800);
											
				System.out.printf("El camión con mátricula %s tiene una carga acutal"
						+ " de %f kg %n", camion.getMatricula(), camion.getCargaActual() );

				System.out.println("cargo una caja de 560kg");
				camion.cargarCaja(560);
				
				System.out.printf("El camión con mátricula %s tiene una carga acutal"
						+ " de %f kg %n", camion.getMatricula(), camion.getCargaActual() );
				
				System.out.printf("cargo una caja de 100kg %n");
				camion.cargarCaja(100);				

				System.out.printf("El camión con mátricula %s tiene una carga acutal"
						+ " de %f kg %n", camion.getMatricula(), camion.getCargaActual() );
				;		


				
		} catch (Exception e) {
			System.out.println("No pudo cargar " + e.getMessage());
		}
		
	}

}
