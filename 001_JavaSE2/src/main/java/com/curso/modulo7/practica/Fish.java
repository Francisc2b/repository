package com.curso.modulo7.practica;

public class Fish extends Animal implements Pet {
	
	private String name;
	

	
	public Fish() {
		super(0);
	}

	
	public Fish(String name) {
		super(0);
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void play() {
		System.out.println("El pez nada en la pecera");
	}

	@Override
	public void eat() {
		System.out.println("Come pienso");
		
	}

}
