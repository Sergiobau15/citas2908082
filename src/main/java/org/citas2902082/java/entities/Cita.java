package org.citas2902082.java.entities;

import java.time.*;

public class Cita {
    private LocalDateTime fecha;
    private Paciente paciente;

    public Cita(LocalDateTime fecha, Paciente paciente) {
        this.fecha = fecha;
        this.paciente = paciente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}


