package com.curso.modulo8;

public class PruebasExcepciones {
	
	public static void main(String[] args) {
		
		int resultado  = doble("dos");
		System.out.printf("el doble de %d es %d %n", 2, resultado);
		
	}
	
	public static int doble(String numero) {
		//validar que numro es valido	
		
		
		int numeroInicial = 0;
		
		try {
			numeroInicial = Integer.parseInt(numero);
		} catch (NumberFormatException e) {
		System.out.println("no se puede alcular el doble" + e.getMessage());
		}
		
		return numeroInicial * 2;
	}

}
