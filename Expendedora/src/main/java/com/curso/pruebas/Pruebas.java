package com.curso.pruebas;

import com.curso.maquina.Maquina;
import com.curso.maquina.Refresco;

public class Pruebas {

	public static void main(String[] args) {
		
		Refresco r1 = new Refresco();		
		r1.setCl(33);
		//r1.setId(1);
		r1.setPrecio(125);
		r1.setSabor("naranja");
		r1.setStock(25);
		
		Refresco r2 = new Refresco();		
		r2.setCl(125);
		//r2.setId(2);
		r2.setPrecio(218);
		r2.setSabor("limon");
		r2.setStock(15);
		
		//Maquina maq1 = new Maquina();
		//maq1.setCaja(200);
		//maq1.setStockaje(40);

		System.out.println(r1);
		System.out.println(r2);		
		
		//System.out.printf("La caja tiene %d cts€%n", maq1.getCaja());
		
		//int i = r1.getStock() + r2.getStock();
		//maq1.setStockaje(r1.getStock() + r2.getStock());

		//System.out.printf("La expendedora tiene %d latas %n", maq1.getStockaje());
		
		


	}

	

}
