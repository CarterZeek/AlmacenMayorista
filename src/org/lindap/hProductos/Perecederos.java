package org.lindap.hProductos;

public class Perecederos extends Producto{
    private String caducidad;

    public Perecederos(){
    super();
    }
    public Perecederos(String nombre, double precio, int cantidad, String caducidad){
        super(nombre, precio, cantidad);
        this.caducidad = caducidad;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaducidad:" + caducidad;
    }
}
