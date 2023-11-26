package org.ada;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1,"Yenny", "Malavera", "01/12/2023", "Matriculado");
        Estudiante estudiante2 = new Estudiante(2,"Samuel", "Lopez", "01/12/2023", "Inactivo");
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        Curso curso1 = new Curso(123,"Matematicas", "Ciencias basicas",3, "primer nivel");
        Curso curso2 = new Curso(123,"Fisica", "Ciencias basicas",3, "primer nivel");
        System.out.println(curso1);
        System.out.println(curso2);
    }
}