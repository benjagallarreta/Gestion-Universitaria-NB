package com.mycompany.Logica;

// Plan A - Aprobó todas las cursadas de las correlativas

public class PlanA implements StrategyPlanEstudio {

    @Override
    public boolean verificarCondicion(Materia materia, Alumno alumno) {
        
        // recorro la lista de las correlativas [materia.getCorrelativas]
        // recorro la lista de historia academica [alumno.getHistoriaAcademica();]
        // determino si el nombre de la correlativa es el mismo que el nombre de la historia academica
        // determino si el estado de la historia academica esta aprobada
        // en funcion de eso inscribo o no
        
        for (Materia correlativa : materia.getCorrelativas()) {    
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (
                    cursada.getNombre().equals(correlativa.getNombre()) &&
                    cursada.getEstado() != MateriaCursada.Estado.regular
                ) {
                    System.out.println("entre");
                    return false;
                }
            }
        }
        return true;
    }
}
