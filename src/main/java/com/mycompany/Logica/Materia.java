package com.mycompany.Logica;

import java.util.ArrayList;

public class Materia {
    
    private String codigo,nombre,tipo;
    private int cuatrimestre;
    public ArrayList<Materia> correlativas;
    public ArrayList<Alumno> alumnos_inscriptos;

    public Materia() {
        this.correlativas = new ArrayList<>();
        this.alumnos_inscriptos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() { 
        return codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }
    
    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnos_inscriptos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnos_inscriptos;
    }
}
