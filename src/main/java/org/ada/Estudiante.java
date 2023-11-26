package org.ada;

public class Estudiante extends Persona {
    private int id;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                "} " + super.toString();
    }
}
