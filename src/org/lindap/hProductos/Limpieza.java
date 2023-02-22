package org.lindap.hProductos;

public class Limpieza extends Producto{
    private int litros;

    public Limpieza(){ super();}
    public Limpieza(String nombre, double precio, int cantidad, int litros){
        super();
        this.litros = litros;
    }
    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
}
