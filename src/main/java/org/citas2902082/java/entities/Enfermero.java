package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.*;

public class Enfermero extends Usuario{

    public Enfermero(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    }

    
}
