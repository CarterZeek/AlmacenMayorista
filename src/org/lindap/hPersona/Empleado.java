package org.lindap.hPersona;

public class Empleado extends Persona{
    private int nomina;
    private String area;

    public Empleado(){
        super();
    }
    public Empleado(String nombre, String apellido, int edad, int nomina, String area){
        super(nombre,apellido,edad);
        this.nomina = nomina;
        this.area = area;
    }
    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNómina:" + nomina + "\nÁrea:" + area;
    }
}
