package org.citas2902082.java.entities;

import java.time.*;
import org.citas2902082.java.entities.enums.*;

public class Paciente extends Usuario{

    private String correoElectronico;
    private Long celular;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    //CONSTRUCTORES
    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String correoElectronico, Long celular, LocalDate localDate,
            double altura, double peso, TipoSangre tipoSangre, char factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = localDate;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }
    

    //GETTERS Y SETTERS
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public Long getCelular() {
        return celular;
    }


    public void setCelular(Long celular) {
        this.celular = celular;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public char getFactorRH() {
        return factorRH;
    }


    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }
    
}
