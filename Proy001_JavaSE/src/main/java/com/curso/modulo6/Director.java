package com.curso.modulo6;

public class Director extends Gerente{

	private double vehiculoEmpresa;
	private double avion;
	
	


	@Override
	public String getDetails() {
		return super.getDetails() + "\n vehiculoEmpresa: "+ vehiculoEmpresa;
	}



	public double getVehiculoEmpresa() {
		return vehiculoEmpresa;
	}

	public void setVehiculoEmpresa(double vehiculoEmpresa) {
		this.vehiculoEmpresa = vehiculoEmpresa;
	}

	public double getAvion() {
		return avion;
	}

	public void setAvion(double avion) {
		this.avion = avion;
	}
	
	
	
		

}
