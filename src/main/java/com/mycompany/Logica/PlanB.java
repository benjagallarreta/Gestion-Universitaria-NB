package com.mycompany.Logica;

// Plan B - Aprobó los finales de las correlativas 
public class PlanB implements StrategyPlanEstudio {

    @Override
    public boolean verificarCondicion (Materia materia, Alumno alumno) {

        //acceder a las materias correlativas de la materia pasada como parametro
        //recorrer la lista de las materias correlativas
        //verificar si esas materias correlativas tiene como estado "aprobado"
        //inscribir alumno en caso de que esto suceda
        
        for (Materia correlativa : materia.getCorrelativas()) {

            System.out.println("entre");
            
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                System.out.println("entre al segundo");
                if (cursada.getNombre().equals(correlativa.getNombre()) && 
                cursada.getEstado() != MateriaCursada.Estado.aprobado) {
                    return false;
                }
            
            }
        }
    
        return true;
    }

}
