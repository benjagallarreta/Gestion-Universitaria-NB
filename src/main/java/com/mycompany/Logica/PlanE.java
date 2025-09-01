package com.mycompany.Logica;

//Plan E: aprobó los finales de las correlativas y los finales de todas las materias de 3cuatrimestres previos.
public class PlanE implements StrategyPlanEstudio {

    @Override
    public boolean verificarCondicion(Materia materia, Alumno alumno) {
        // Verifica finales de correlativas
        for (Materia correlativa : materia.getCorrelativas()) {
            boolean estaAprobada = false;

            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (cursada.getNombre().equals(correlativa.getNombre())
                        && cursada.getEstado() == MateriaCursada.Estado.aprobado
                        && cursada.getMateria().getCuatrimestre() <= materia.getCuatrimestre() - 3) {
                    estaAprobada = true;
                    break;
                }
            }

            if (!estaAprobada) {
                return false;
            }
        }

        // Verifica finales de todas las materias de los 3 cuatrimestres previos
        for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
            if (cursada.getMateria().getCuatrimestre() <= materia.getCuatrimestre() - 3) {
                if (cursada.getEstado() != MateriaCursada.Estado.aprobado) {
                    return false;
                }
            }
        }

        return true;
    }

}