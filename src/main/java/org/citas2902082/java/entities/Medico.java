package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.*;

public class Medico extends Usuario{
    private Long registroMedico;
    private Especialidad especialidad;

    //CONSTRUCTORES
    public Medico(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, Long registroMedico, Especialidad especialidad) {
        //constructor de la clase padre en un constructor de la clase hija
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    //GETTERS Y SETTERS
    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    //metodo toString
    @Override
    public String toString() {
        return
        super.toString() +
        "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    } 
    
}
