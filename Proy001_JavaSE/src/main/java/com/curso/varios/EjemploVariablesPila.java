package com.curso.varios;

public class EjemploVariablesPila {
	
	public static void main(String[] args) {		
		int a = 2;
		metodo1(a);
		System.out.println("fin main");
	}
	
	public static void metodo1(int numero) {
		int b = numero;
		metodo2();
		System.out.println("fin m1");
	}
	
	public static void metodo2() {
		int c = 3;
		
//		String s = null;
//		s.toUpperCase();
		
		System.out.println("fin m2");
	}

}
