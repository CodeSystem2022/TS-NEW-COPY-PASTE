
package test;

import domain.*;


public class TestSobreEscritura {
    public static void main(String[] args) { 
        Empleado empleado1 = new Empleado("juan", 10000);
        imprimir(empleado1);
       // System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        empleado1 = new Gerente("jose", 5000, "sistemas");
        imprimir(empleado1);
       //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
    }
    public static  void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
    
}