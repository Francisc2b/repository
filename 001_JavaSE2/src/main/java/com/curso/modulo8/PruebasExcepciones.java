package com.curso.modulo8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
	
	public static void gardarResultado(String nombreFichero, int resltado) {

		File f = new File(nombreFichero);
		File f2 = new File("parametros.txt");
	
			
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}fi
			
			FileReader fr = new FileReader(f2);
			
		
		
	}

}
