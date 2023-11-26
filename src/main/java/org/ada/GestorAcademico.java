package org.ada;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements IServiciosAcademicos{
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();
    HashMap<Curso, ArrayList<Estudiante>> inscripciones = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) {

    }

    @Override
    public void agregarCurso(Curso curso) {

    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) {

    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {

    }
}
