package com.curso.modulo7.practica;

public abstract class Animal {
	
	protected int legs;

	protected Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("El Animal anda con: " + legs);
		
	}
}
