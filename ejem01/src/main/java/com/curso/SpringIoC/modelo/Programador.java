package com.curso.SpringIoC.modelo;

/**
 *
 * @author PROGRAMIA
 */
public class Programador implements Recurso {
    private String tarea;

    public Programador() {
        tarea ="Programar";
    }


    public void trabajar() {
        System.out.println("REALIZO LA TAREA " + tarea);;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }


}
