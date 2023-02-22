package org.lindap.main;
import org.lindap.hPersona.*;
import org.lindap.hProductos.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Almacen Mayorista Linda");

        Empleado dwigth = new Empleado("Dwigth","Schrute",27,654321,"Ventas");
        Empleado jim = new Empleado("Jim","Halpert",28,123456,"Ventas");

        Cliente kelly = new Cliente("Kelly","kapoor",34,3214);
        Cliente tod = new Cliente("Todd","Packer",43,5678);

        Perecederos sandia = new Perecederos("sandia",80.0d,1,"10 MAR 23");
        Perecederos queso =  new Perecederos("queso panela",45.0,3,"1 MAR 23");
        NoPerecederos mermelada = new NoPerecederos("mermelada",35.2d,2,"Mermelada " +
                "de fresa en frasco");
        NoPerecederos chile = new NoPerecederos("Chiles",15.0d,5,"chile jalapeño en rajas " +
                "enlatado");
        Limpieza jabon = new Limpieza("Jabón",25.0d,1,0);
        Limpieza cloro = new Limpieza("Cloro",20.0d,2,1);

        System.out.println("===========================");
        imprimirEmp(dwigth);
        imprimirEmp(jim);

        System.out.println("============================");
        imprimirCl(kelly);
        imprimirCl(tod);

        System.out.println("=============================");
        imprimirPr(sandia);
        imprimirPr(queso);
        imprimirPr(mermelada);
        imprimirPr(chile);
        imprimirPr(jabon);
        imprimirPr(cloro);

    }
    public static void imprimirEmp(Empleado empleado){
        System.out.println(".:Empleados registrados:.");
        System.out.println(empleado);
    }
    public static void imprimirCl(Cliente cliente){
        System.out.println(".:Clientes frecuentes:.");
        System.out.println(cliente);
        }
        public static void imprimirPr(Producto producto){
            System.out.println(".:Productos de diferentes áreas:.");
            System.out.println(producto);
        }
}