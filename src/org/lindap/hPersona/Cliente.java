package org.lindap.hPersona;

public class Cliente extends Persona{
    private int id;

    public Cliente() {
        super();
    }
    public Cliente(String nombre,String apellido, int edad,int id){
        super(nombre,apellido,edad);
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Id cliente frecuente:" + id;
    }
}
