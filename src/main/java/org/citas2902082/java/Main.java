package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.enums.*;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(1, 
                            "Sergio", 
                            "Bautista", 
                            TipoIdentificacion.TI, 
                            1033054862L, 
                            5421L, 
                            Especialidad.Neurologia);
        System.out.println(m.toString());

    }
}