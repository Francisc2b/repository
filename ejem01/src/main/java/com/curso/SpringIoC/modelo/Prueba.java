package com.curso.SpringIoC.modelo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * CREACION DE UN BEAN EN SPRING CONTEXT
 * USANDO ANOTACION @AUTOWIRED
 * @author PROGRAMIA
 */
public class Prueba {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ejem01/gestion.xml");
        Gestor servicio = (Gestor) context.getBean("jefe1");
        servicio.gestionar();
    }

}
