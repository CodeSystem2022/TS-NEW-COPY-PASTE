
package test;

import domain.Persona;


public class TestForEach {
    public static void main(String[] args) {
       //sintaxis resumida 
       int edades[] = {5,6,8,9};
       //sintaxis forEach, no se puede mostrar el indice
        for (int edad: edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas[ ]= {new Persona("juan"),new Persona("CARLA"), new Persona("beatriz")};
        
        //foreach
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
    }
   
}
