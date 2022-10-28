package com.curso.spring.ejemplo01;

import java.util.logging.Logger;

public class SaludoServiceImpl implements SaludoService{

	Logger logger = Logger.getLogger("SaludoServiceImpl");
	
	@Override
	public void saludar(String mensaje) {
		if(mensaje == null) {

			logger.severe("error gordo");
			throw new IllegalArgumentException("el mensaje biene null");
		}

		logger.info("salutacion");
		logger.info("Hola " + mensaje + "¡¡¡!!!!");
		
	}

}
