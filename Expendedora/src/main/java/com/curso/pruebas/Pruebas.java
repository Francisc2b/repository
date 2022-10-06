package com.curso.pruebas;

import com.curso.maquina.Refresco;

public class Pruebas {

	public static void main(String[] args) {
		
		Refresco r1 = new Refresco();		
		r1.setCl(33);
		r1.setId(1);
		r1.setPrecio(1.25);
		r1.setSabor("naranja");
		r1.setStock(25);
		
		Refresco r2 = new Refresco();		
		r2.setCl(125);
		r2.setId(2);
		r2.setPrecio(2.18);
		r2.setSabor("limon");
		r2.setStock(12);
		

		System.out.println(r1);
		System.out.println(r2);

	}

}
