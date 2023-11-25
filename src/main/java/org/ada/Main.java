package org.ada;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1,"Daniel", "Medina", "01/12/2023", "Matriculado");
        Estudiante estudiante2 = new Estudiante(2,"Samuel", "Lopez", "01/12/2023", "Inactivo");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
    }
}