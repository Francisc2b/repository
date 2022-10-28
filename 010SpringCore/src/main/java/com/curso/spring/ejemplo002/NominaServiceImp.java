package com.curso.spring.ejemplo002;

import org.springframework.stereotype.Service;

@Service
public class NominaServiceImp implements NominasService {
	
	

	private IRPFService irpfService;

	@Override
	public void calcularNomina() {
		System.out.println("...nomina es  ...");
		System.out.println("y el IRP es");

	}

}
