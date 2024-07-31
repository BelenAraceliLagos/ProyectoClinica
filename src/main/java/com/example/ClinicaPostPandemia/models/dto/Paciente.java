package com.example.ClinicaPostPandemia.models.dto;

public class Paciente {

    private String rut;
    private String nombre;
    private int edad;
    private String prevision;

    public Paciente(){
    }

    public Paciente(String rut, String nombre, int edad, String prevision) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.prevision = prevision;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }
}
