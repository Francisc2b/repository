package com.curso.spring.ejemplo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {
	
	public static void main(String[] args) {
		
		 //SIN SPRING IOP
				SaludoService service = new SaludoServiceImpl();		
				service.saludar("Amigo");
//		
		//CON SPRING InyerccionDependencias
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mis-beans.xml");
		
		SaludoService s1 = (SaludoService) ctx.getBean("saludador1");
		s1.saludar("soy saludador1");
		
	}

}
