package com.mycompany.Logica;

//Plan D: aprobó las cursadas de las correlativas y los finales de todas las materias de 3 cuatrimestres previos al que se quiere anotar.
public class PlanD implements StrategyPlanEstudio {
    
    @Override
    public boolean verificarCondicion (Materia materia, Alumno alumno) {

        for (Materia correlativa : materia.getCorrelativas()) {
            boolean estaAprobada = false;
    
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (cursada.getNombre().equals(correlativa.getNombre()) 
                    && (cursada.getEstado() == MateriaCursada.Estado.aprobado 
                        && correlativa.getCuatrimestre() < 3)) {
                        estaAprobada = true;
                        break;
                }
            }
    
            if (!estaAprobada) {
                return false;
            }
        }
    
        return true;

    }

}
