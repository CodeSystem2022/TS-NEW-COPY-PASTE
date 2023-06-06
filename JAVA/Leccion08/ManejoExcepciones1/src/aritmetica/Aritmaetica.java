
package aritmetica;

import exepciones.OperacionExepcion;

public class Aritmaetica {
    public static int division(int numerador, int denominador){
        if(denominador == 0){
      
            throw new OperacionExepcion("divicion entre  cero");
  
        }
        return numerador/denominador;
    
    }
}
