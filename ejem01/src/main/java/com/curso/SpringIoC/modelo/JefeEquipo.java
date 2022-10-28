
package com.curso.SpringIoC.modelo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PROGRAMIA
 */
public class JefeEquipo  implements Gestor{

    private int equipo;
    
    @Autowired
    private Recurso recurso;

    public JefeEquipo() {
        equipo= 1;
    }

    public JefeEquipo(int equipo, Recurso recurso) {
        this.equipo = equipo;
        this.recurso = recurso;
    }
    

    public void gestionar() {
        System.out.println("GESTIONO EL EQUIPO " + equipo );
        System.out.println("Iniciar Recursos");
        recurso.trabajar();
    }

}
