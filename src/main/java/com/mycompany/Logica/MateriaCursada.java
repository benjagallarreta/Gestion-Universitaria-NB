package com.mycompany.Logica;

public class MateriaCursada {

    private Materia materia;
    private Estado estado;

    public enum Estado {
        cursando("En Curso"),
        regular("Regular"),
        aprobado("Aprobado");

        private final String valor;

        Estado(String valor) {
            this.valor = valor;
        }

        @Override
        public String toString() {
            return valor;
        }
    }

    @Override
    public String toString() {
        return materia.getNombre() + " - " + estado;
    }

    public MateriaCursada(Materia materia, Estado estado) {
        this.materia = materia;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNombre() {
        return materia.getNombre();
    }

    public Materia getMateria() {
        return this.materia;
    }

    public MateriaCursada getMateriaCursada() {
        return this;
    }
}
