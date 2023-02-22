package org.lindap.hPersona;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){

    }
    public Persona(String nombre,String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nApellido:" + apellido +"\nEdad:" + edad + " años.";
    }
}
