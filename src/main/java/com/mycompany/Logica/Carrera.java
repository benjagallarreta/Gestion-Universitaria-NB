package com.mycompany.Logica;

import java.util.ArrayList;

public class Carrera {
    
    private String nombre;
    private int cuatrimestresTotales;
    private ArrayList<Materia> materiasContenidas;
    private ArrayList<Alumno> alumnosContenidos;
    private StrategyPlanEstudio planEstudio;
    

    public Carrera() {
        this.materiasContenidas = new ArrayList<>();
        this.alumnosContenidos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPlanEstudio(StrategyPlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public StrategyPlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setCuatrimestresTotales(int cuatrimestresTotales) {
        this.cuatrimestresTotales = cuatrimestresTotales;
    }

    public int getCuatrimestresTotales() {
        return cuatrimestresTotales;
    }

    public void addAlumno(Alumno alumno) {
            alumnosContenidos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnosContenidos;
    }

    public ArrayList<Materia> getMateriasContenidas() {
        return materiasContenidas;
    }
    
    public void addMaterias(Materia materia) {
        materiasContenidas.add(materia);
    }

    public String getMateriasString() {
        System.out.println("cantidad de materias contenidas: "+materiasContenidas.size());
        StringBuilder nombres = new StringBuilder();
        for (Materia materia : materiasContenidas) {
            nombres.append(materia.getNombre()).append("\n");
        }
        return nombres.toString(); 
    }

    public String getAlumnosString() {
        System.out.println("cantidad de alumnos inscriptos: "+alumnosContenidos.size());
        StringBuilder nombres = new StringBuilder();
        for (Alumno alumno : alumnosContenidos) {
            nombres.append(alumno.getNombre()).append(" ").append(alumno.getApellido()).append("\n");
        }
        return nombres.toString(); 
    }

    public void getCarrera(Carrera carrera) {
        System.out.println();
        System.out.println("Informacion de la Carrera:");
        System.out.println(carrera.getNombre());
        System.out.println("Cuatrimestres Totales: "+carrera.getCuatrimestresTotales());
        System.out.println(carrera.getMateriasString());
        System.out.println(carrera.getAlumnosString());
    }

    public void InscribirMateria(Materia materia, Alumno alumno) {
        if  (planEstudio.verificarCondicion(materia, alumno)) {
            System.out.println("Alumno Inscripto Correctamente");
        } else { 
            System.out.println("El alumno no pudo ser inscripto a la materia");
        }
        
    }
}