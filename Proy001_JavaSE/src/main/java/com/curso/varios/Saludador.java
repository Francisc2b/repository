package com.curso.varios;

public class Saludador {
	
	//atributos
	private String saludo;
	
	
	//constructores
	public Saludador() {
		super();
		this.saludo  = "Hola ";
	}
	
	
	public Saludador(String saludo) {
		this.saludo = saludo;
	}
	


	//métodos
	public String saluda(String nombreUsuario) {		
		return saludo  + nombreUsuario;
	}
	
	
	// sobrecargar el método
	public String saluda() {		
		return this.saludo + " Amigo";
	}

}
