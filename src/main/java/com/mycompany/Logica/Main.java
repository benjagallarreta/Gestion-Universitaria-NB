package com.mycompany.Logica;
import com.mycompany.Vistas.VistaPrincipal;

public class Main {

    private static void CargaEstatica() {
        GestionUniversitaria GU = new GestionUniversitaria();
        
        StrategyPlanEstudio planA = new PlanA();
        StrategyPlanEstudio planB = new PlanB();
        StrategyPlanEstudio planC = new PlanC();
        StrategyPlanEstudio planD = new PlanD();
        StrategyPlanEstudio planE = new PlanE();
        

        Carrera c1 = new Carrera();
            c1.setNombre("Cocina Criolla");
            c1.setCuatrimestresTotales(6);

        StrategyPlanEstudio plan = new PlanC();
        c1.setPlanEstudio(planB);
        
            Materia m1 = new Materia();
            m1.setCodigo("0001");
            m1.setNombre("introduccion a la torta frita I");
            m1.setCuatrimestre(1);
            m1.setTipo("obligatoria");

            Materia m2 = new Materia();
            m2.setCodigo("0002");
            m2.setNombre("Estructurado y coccion de carnes");
            m2.setCuatrimestre(1);
            m2.setTipo("optativa");    

            m2.agregarCorrelativa(m1);

        // agregar carrera y materias a la gestion universitaria
        GU.agregarCarrera(c1);
        GU.agregarMateria(c1, m1);
        GU.agregarMateria(c1, m2);

        Alumno a1 = new Alumno();
            a1.setNombre("Lucía");
            a1.setApellido("Gómez");
            a1.setLegajo(120001);
            a1.setDNI(42650001);
        
        Alumno a2 = new Alumno();
            a2.setNombre("Martín");
            a2.setApellido("Fernández");
            a2.setLegajo(120002);
            a2.setDNI(42650002);
        
        GU.validarAlumno(a1);
        GU.validarAlumno(a2);

        GU.inscribirCarrera(a1, c1);
        GU.inscribirCarrera(a2, c1);

        m1.agregarCorrelativa(m2);
        System.out.println(m1.getCorrelativas());
        MateriaCursada m1Cursada = new MateriaCursada(m2, MateriaCursada.Estado.aprobado);
        a1.agregarMateria(m1Cursada);
        System.out.println(a1.getHistoriaAcademica());
        c1.InscribirMateria(m1, a1);

    }

    private static void MostrarInterfaz() {
        VistaPrincipal ventana = new VistaPrincipal(); 
        ventana.setVisible(true);
    }
    public static void main(String[] args) {
        CargaEstatica();
        MostrarInterfaz();
        System.out.println("Compilacion Exitosa");
    }
}