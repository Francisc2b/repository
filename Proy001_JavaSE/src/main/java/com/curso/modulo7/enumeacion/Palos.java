package com.curso.modulo7.enumeacion;

public enum Palos {
	
	OROS, BASTOS, COPAS, ESPADAS
	
	

}

enum ModelosCoche{
	BASICO("Solo tiene motor  ruedas"), 
	MEDIO("tiene aire acondicionado"), 
	SUPERIOR("con navegador");
	
	private String descripcion;

	private ModelosCoche(String s) {
		this.descripcion = s;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}
