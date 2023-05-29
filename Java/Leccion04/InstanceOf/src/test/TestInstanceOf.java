
package test;

import domain.*;


public class TestInstanceOf {
    public static void main(String[] args) { 
        Empleado empleado1 = new Empleado("juan", 10000);
        determinarTipo(empleado1);
       
    
        empleado1 = new Gerente("jose", 5000, "sistemas");
        //determinarTipo(empleado1);
    }
    public static  void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("es de tipo gerente");
            ((Gerente) empleado).getDepartamento();
            //Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = "+empleado);
            
        }
        else if(empleado instanceof Empleado){
            System.out.println("es de tipo empleado");
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = "+gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
             System.out.println("es de tipo objet");
        }
    }
    
}
