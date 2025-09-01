package com.mycompany.Logica;

// Plan C: aprobó las cursadas de las correlativas y los finales de todas las materias de 5 cuatrimestres previos al que se quiere anotar

import java.util.ArrayList;

public class PlanC implements StrategyPlanEstudio{

    @Override
    public boolean verificarCondicion (Materia materia, Alumno alumno) {
        // confirmo que las correlativas de la materia esten regulares
        for (Materia correlativa : materia.getCorrelativas()) {
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (cursada.getNombre().equals(correlativa.getNombre()) 
                    && (cursada.getEstado() != MateriaCursada.Estado.regular)) {
                            return false;
                        }
            }
        }
        // me fijo que las materias de 5 cuatrimestres previos a la materia que me quiero anotar
        //esten regulares
        ArrayList<Materia>PlanDeEstudioDeLaCarrera = alumno.getCarreraInscripta().getMateriasContenidas();
        
        for (Materia materia2 : PlanDeEstudioDeLaCarrera){
            if (materia2.getCuatrimestre()>materia.getCuatrimestre()-5 && materia2.getCuatrimestre()<materia.getCuatrimestre())
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (cursada.getNombre().equals(materia2.getNombre()) 
                    && (cursada.getEstado() != MateriaCursada.Estado.aprobado)) {
                            return false;
                        }
            }
        
        }
        return true;

    }
    
}
