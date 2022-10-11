package com.curso.modulo6;

public class Prueba {

	public static void main(String[] args) {

		Empleado e = new Empleado();
		e.setNombre("Luís Ramos");
		e.setSalario(40000);

		Gerente g = new Gerente();
		g.setNombre("Begoña");
		g.setDepartamento("Desarrollo");
		g.setSalario(70000);

		System.out.println("g es un gerente?" + (g instanceof Gerente));

		System.out.println("g es un empleado?" + (g instanceof Empleado));

		System.out.println("e es un gerente?" + (e instanceof Gerente));

		Empleado carlos = new Gerente();

		carlos.setNombre("Carlos Romero");
		carlos.setSalario(45000);
		
		Director d1 = new Director();
		d1.setNombre("Juan");
		d1.setSalario(20000);
		d1.setDepartamento("Direccion provincial");
		d1.setVehiculoEmpresa(2);
		
		Gerente d2 = new Gerente();
		d2.setNombre("Ana");
		d2.setSalario(30000);
		d2.setDepartamento("Direccion Autonomica");
		//Director d3 = ((Director) d2);
		//d3.setVehiculoEmpresa(1);
		System.out.println(d1.getDetails());
	
	}

}
