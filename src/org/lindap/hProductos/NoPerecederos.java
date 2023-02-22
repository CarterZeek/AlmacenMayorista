package org.lindap.hProductos;

public class NoPerecederos extends Producto{
    private String descripcion;

    public NoPerecederos(){ super();}
    public NoPerecederos(String nombre, double precio, int cantidad, String descripcion){
        super(nombre,precio,cantidad);
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return super.toString() + "Descripción:"+ descripcion;
    }
}
