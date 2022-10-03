package com.curso.pruebas;

import java.util.Date;

import com.curso.varios.Saludador;

public class PruebaSaludador {

	public static void main(String[] args) {
		
		// uso de la clase Saludador
		
		int numeroCamiones = 2;
		Date fecha = new Date();
		
		// 1. Se puede crear un objeto Saludador
		//	crear un objeto de la clase, instanciar un objeto de la clase
		//s1 es una variable de rerencia que apunta a objettos de tipo Saludador
		Saludador s1 = new Saludador();
		
		
		//2. Pedir saludar pasando nombre -> muestra "Hola " + nombre
		
		System.out.println(s1.saluda("Begoña Olea"));
		
		
		//3. Pedir saludar sin nombre -> "Hola Amigo"
		System.out.println(s1.saluda());
		
		//4. Crear un saludador en el que indique el saludo
		Saludador s2 = new Saludador("Buenos días");
		
		//5. Pedir saludo sin nombre "Buenos ías Amigo"
		System.out.println(s2.saluda());
	}

}
