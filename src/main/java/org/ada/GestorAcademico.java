package org.ada;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();
    HashMap<Curso, ArrayList<Estudiante>> inscripciones = new HashMap<>();
}
