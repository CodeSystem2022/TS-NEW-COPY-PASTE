import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){


            System.out.print("******* Aplicacion Calculadora *******");
            System.out.println();

            mostrarMenu();
            try {
                    var operacion= Integer.parseInt(entrada.nextLine());
                    if (operacion >=1 && operacion <=4){

                        ejecutarOperacion(operacion,entrada);

                    }//fin if
                    else if(operacion ==5){
                        System.out.println("hasta pront...");
                        break;
                    }
                    else {
                        System.out.println("Opcion erronea: "+operacion);
                    }
                    //imprimimos un salto de linea antes de repetir el menu
                    System.out.println();
            }catch (Exception e){//fin try
                System.out.println("ocurrio un error: "+e.getMessage());
                System.out.println();
            }

        }//fin while

    }//fin main
    private static void mostrarMenu(){
        //mostramos el menu
        System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Division
                    5.salir
                    """);
        System.out.print("Operacion a Realizar: ");
    }//fin metodo mostrar menu
    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("digite el valor para el operador1: ");
        var operando1=Double.parseDouble(entrada.nextLine());
        System.out.print("digite el valor para el operador2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        Double resultado;
        switch (operacion){
            case 1 ->{
                resultado = operando1 + operando2;
                System.out.println("resultado de la suma = " + resultado);
            }
            case 2 ->{
                resultado = operando1 - operando2;
                System.out.println("resultado de la resta = " + resultado);
            }
            case 3 ->{
                resultado = operando1 * operando2;
                System.out.println("resultado de la multiplicacion = " + resultado);
            }
            case 4 ->{
                resultado = operando1 / operando2;
                System.out.println("resultado de la division = " + resultado);
            }
            default -> System.out.println("opcion erronea: " + operacion);
        }//fin switch

    }//fin metodo ejecutar

}//fin clase
