package org.citas2902082.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.CitaEnfermero;
import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
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

        Medico m2 = new Medico(2,
                            "Andres", 
                            "Perez", 
                            TipoIdentificacion.TI, 
                            1022366455L,   
                            5262L, Especialidad.Odontologia);


        Paciente p1 = new Paciente(1, 
                        "Bob", 
                        "Esponja", 
                        TipoIdentificacion.CC, 
                        1023466564L, 
                        "bobespojna@gmail.com", 
                        314665564L, 
                        LocalDate.of(2004, 8, 15),
                        175, 
                        58, 
                        TipoSangre.O,
                        '+');

        Paciente p2 = new Paciente(2, 
                        "Alejandro", 
                        "Gomez", 
                        TipoIdentificacion.CC, 
                        1023466451L, 
                        "alejandritoaa@gmail.com", 
                        314678914L, 
                        LocalDate.of(1998, 12, 22),
                        162, 
                        50, 
                        TipoSangre.O,
                        '-');


        Paciente p3 = new Paciente(3, 
                        "Marco", 
                        "Sanchez", 
                        TipoIdentificacion.CC, 
                        1023564564L, 
                        "marco@gmail.com", 
                        314665487L, 
                        LocalDate.of(2001, 11, 16),
                        180, 
                        90, 
                        TipoSangre.O,
                        '+');



         Paciente p4 = new Paciente(4, 
                        "Mike", 
                        "Torres", 
                        TipoIdentificacion.CC, 
                        1023234564L, 
                        "mik@gmail.com", 
                        314612344L, 
                        LocalDate.of(2002, 11, 16),
                        155, 
                        42, 
                        TipoSangre.AB,
                        '+');


            Paciente p5 = new Paciente(5, 
                        "Julian", 
                        "Alvarez", 
                        TipoIdentificacion.CC, 
                        1023466123L, 
                        "julian@gmail.com", 
                        314664564L, 
                        LocalDate.of(2000, 8, 05),
                        177, 
                        99, 
                        TipoSangre.B,
                        '-');
            
            Enfermero e1 = new Enfermero(1, 
                        "Doctora", 
                        "Juguetes", 
                        TipoIdentificacion.CC, 
                        10646101L);

            Enfermero e2 = new Enfermero(2, 
                        "Juanito", 
                        "Casandra", 
                        TipoIdentificacion.CC, 
                        1064511101L);

            Enfermero e3 = new Enfermero(3, 
                        "Nicolas", 
                        "Gonzales", 
                        TipoIdentificacion.CC, 
                        103475101L);

            CitaMedico c1 = new CitaMedico(1, 
                            LocalDateTime.of(2024, 4, 2, 12, 15, 8),
                            p5, new Consultorio(1, "Calle 2 24 05", 405), 
                            "Gripe", 
                            m2, 
                            Estado.Agendada);


            CitaMedico c2 = new CitaMedico(2, 
                            LocalDateTime.of(2024, 3, 24, 12, 15, 8),
                            p2, new Consultorio(1, "Calle 2 24 05", 408), 
                            "Escopolamina", 
                            m, 
                            Estado.Agendada);

            
            CitaEnfermero ce1 = new CitaEnfermero(1, 
                            LocalDateTime.of(2024,11,10,12,22,13),
                            p1, 
                            new Consultorio(2,"calle 80 20 12", 512),
                            "vacuna", 
                            e3);

            CitaEnfermero ce2 = new CitaEnfermero(2, 
                            LocalDateTime.of(2023,12,24,12,15,13),
                            p2, 
                            new Consultorio(3,"calle 80 20 12", 540),
                            "lavado de oidos", 
                            e2);
                
            //SOUTS//
           
            System.out.println("Fecha: " + c1.getFecha() +
                                " | " + "Consultorio: " + c1.getConsultorio() +
                                " | " + "Nombre medico: " + m2.getNombres() +
                                " | " + "Apellidos medico: " + m2.getApellidos() +
                                " | " + "Nombre paciente: " + p5.getNombres() +
                                " | " + "Apellido paciente: " + p5.getApellidos());

            System.out.println("Fecha: " + c2.getFecha() +
                                " | " + "Consultorio: " + c2.getConsultorio() +
                                " | " + "Nombre medico: " + m.getNombres() +
                                " | " + "Apellidos medico: " + m.getApellidos() +
                                " | " + "Nombre paciente: " + p2.getNombres() +
                                " | " + "Apellido paciente: " + p2.getApellidos());


            System.out.println("Fecha: " + ce1.getFecha() +
                                " | " + "Consultorio: " + ce1.getConsultorio() + 
                                " | " + "Nombre Medico: " + e3.getNombres() + 
                                " | " + "Apellidos Medico" + e3.getApellidos());
                                
            System.out.println("Fecha: " + ce2.getFecha() +
                                " | " + "Consultorio: " + ce2.getConsultorio() + 
                                " | " + "Nombre Medico: " + e2.getNombres() + 
                                " | " + "Apellidos Medico" + e2.getApellidos());


            CitaMedico cance1 = new CitaMedico(1, 
                                LocalDateTime.of(2024, 3, 24, 12, 15, 8),
                                p2, new Consultorio(1, "Calle 2 24 05", 408), 
                                "Escopolamina", 
                                m, 
                                Estado.Cancelada);

            System.out.println("Estado de la cita 1: " + cance1.getEstado());

    }
}