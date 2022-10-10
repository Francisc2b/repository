package com.curso.modulo6;

public class Gerente extends Empleado {
	
	private String departamento;
	
	

	@Override
	public String getDetails() {
		return super.getDetails() + "\n Deparatamento: "+ departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
