package com.mycompany.Logica;
import com.mycompany.Vistas.VistaPrincipal;

public class Main {
    
    private static void MostrarInterfaz(GestionUniversitaria GU) {
        VistaPrincipal ventana = new VistaPrincipal(GU); 
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        GestionUniversitaria GU = new GestionUniversitaria();
        
        Alumno a1 = new Alumno();
        a1.setNombre("benja");
        GU.validarAlumno(a1);
        
        Carrera c1 = new Carrera();
        c1.setNombre("Cocina Criolla");
        c1.setCuatrimestresTotales(1);
        StrategyPlanEstudio PlanA = new PlanA(); 
        c1.setPlanEstudio(PlanA);
        GU.agregarCarrera(c1);
        
        MostrarInterfaz(GU);
        
        System.out.println("Compilacion Exitosa");
    }
}