package model;

public class Odontologo {
    private int id;
    private String matrícula;
    private String nombre;
    private String apellido;

    public Odontologo(int id, String matrícula, String nombre, String apellido) {
        this.id = id;
        this.matrícula = matrícula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(String matrícula, String nombre, String apellido) {
        this.matrícula = matrícula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Odontologo{" +
                "numeroMatricula=" + matrícula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
