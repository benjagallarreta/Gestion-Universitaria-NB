package com.mycompany.Logica;

import java.util.ArrayList;
import java.util.HashMap;
public class GestionUniversitaria {

    private HashMap<Integer,Alumno> alumnos;
    private ArrayList<Carrera> carreras;

    public GestionUniversitaria() {
        this.alumnos = new HashMap<>();
        this.carreras = new ArrayList<>();
    }
    
    public void validarAlumno(Alumno alumno) {
        int key = alumno.getLegajo();
        alumnos.put(key,alumno); // HashMap.put(key,object); 
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<>(alumnos.values());
    }


    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
        System.out.println("se agrego la carrera: "+carrera.getNombre());
    }

    public Carrera buscarCarrera(String nombre) {
        String obtenido;
        for (int i = 0; i < carreras.size(); i++) {
            obtenido = carreras.get(i).getNombre();
            if (obtenido.equals(nombre)) {
                return carreras.get(i);
            } 
        }
        return null;
    }
    
    public Alumno buscarAlumno(int DNI){
        return alumnos.get(DNI);
    }
    
    public ArrayList getCarreras() {
        return carreras;
    }

    public void inscribirCarrera(Alumno alumno, Carrera carrera) {
        // Buscar alumno por legajo
        Alumno alumnoEncontrado = alumnos.get(alumno.getLegajo());
        
        if (alumnoEncontrado != null && carrera != null) {
            // Buscar la carrera por nombre en lugar de por referencia
            Carrera carreraEncontrada = buscarCarrera(carrera.getNombre());
            if (carreraEncontrada != null) {
                carreraEncontrada.addAlumno(alumnoEncontrado);
                alumno.setCarrera(carrera);
                System.out.println("Alumno " + alumnoEncontrado.getNombre() + " inscripto en " + carreraEncontrada.getNombre());
            } else {
                System.out.println("La carrera " + carrera.getNombre() + " no está registrada en el sistema");
            }
        } else {
            if (alumnoEncontrado == null) {
                System.out.println("El alumno con legajo " + alumno.getLegajo() + " no fue encontrado");
            }
            if (carrera == null) {
                System.out.println("La carrera no puede ser nula");
            }
        }
    } 

    public void agregarMateria(Carrera carrera, Materia materia) {
        Carrera c = buscarCarrera(carrera.getNombre());
        if (c != null) {
            c.addMaterias(materia);
        }
        System.out.println("se agrego la materia: "+materia.getNombre()+" a la carrera: "+carrera.getNombre());
    }    
    
    public static void verificarFinalizacion(Alumno alumno) {
        for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
            if (cursada.getEstado() != MateriaCursada.Estado.aprobado) {
                System.out.println("Hay al menos una materia desaprobada, el alumno no ha finalizado"); // Hay al menos una no aprobada
            }
        }
        System.out.println("Todas las materias aprobadas, el alumno ha finalizado"); // Todas están aprobadas
    }    
}