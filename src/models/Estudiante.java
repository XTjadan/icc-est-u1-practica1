package models;

public class Estudiante implements Comparable<Estudiante> {
    
    private String codigo;
    private String nombre;
    private int edad;
    private double nota;
    private String carrera;
    
    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, int edad, double nota, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.carrera = carrera;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Estudiante | Codigo = " + codigo + " | nombre = " + nombre + " | edad = " 
                        + edad + "| nota = " + nota
                + "     | carrera = " + carrera ;
    }

    @Override
    public int compareTo(Estudiante otroeEstudiante) {
        return this.codigo.compareTo(otroeEstudiante.getCodigo());
    }    
    }
    