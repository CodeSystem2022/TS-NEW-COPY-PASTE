
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;



public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dias 1: "+Dias.LUNES);
//        indicarDiaSemana(Dias.DOMINGO);
        System.out.println("continentes N°4: "+Continentes.AMERICA);
        System.out.println("N° de paises en el 4to continente: "+Continentes.AMERICA.getPaises());
                System.out.println("N° de habitantes en el 4to continente: "+Continentes.AMERICA.getHabitantes());

        
        
    }
    
    
    private static void indicarDiaSemana(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            case MARTES:
                System.out.println("segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("septimo dia de la semana");
                break;
        }
    }
   
}
