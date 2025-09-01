package com.mycompany.Logica;

import java.util.ArrayList;

public class Alumno {

    private int DNI, legajo;
    private String nombre, apellido;
    private Carrera carreraInscripta;
    private ArrayList<MateriaCursada> historiaAcademica;

    public Alumno() {
        this.historiaAcademica = new ArrayList<>();
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCarrera(Carrera carreraInscripta) {
        this.carreraInscripta = carreraInscripta;
    }

    public Carrera getCarreraInscripta() {
        return carreraInscripta;
    }

    public void agregarMateria(MateriaCursada materia) {
        historiaAcademica.add(materia);
    }

    public ArrayList<MateriaCursada> getHistoriaAcademica() {
        return historiaAcademica;
    } 


}

