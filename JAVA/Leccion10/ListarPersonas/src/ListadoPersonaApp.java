import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListadoPersonaApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //definimos lista fuera del ciclo wile
        List<Persona> personas = new ArrayList<>();
        //menu
        var salir = false;

        while (!salir){
            mostararMenu();
            try {
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("ocurrio un error: "+e.getMessage());
            }
            System.out.println();

        }//fin while

    }//fin main
    private  static void mostararMenu(){
        //ocpciones
        System.out.print("""
                ******listado personas*****
                1.agregar
                2.listar
                3.salir
               
                """);
        System.out.print("digite una opcion: ");
    }//fin mostrar menu
    private  static  boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
    var opcion = Integer.parseInt(entrada.nextLine());
    var salir = false;
    //swich
        switch (opcion){
            case 1->{
                System.out.print("digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print(" digite el correo: ");
                var email = entrada.nextLine();
                //objeto persona
                var persona = new Persona(nombre, tel, email);
                //agregamos la persona a la lista
                personas.add(persona);
                System.out.println("la lista tiene: "+personas.size()+" elementos");

            }//fin case 1
            case 2 ->{
                System.out.println("listado de personas: ");
                //mejoras con lamda y el metodo referencia
                //personas.forEach((persona) -> System.out.println(persona));//otra manera
                personas.forEach(System.out::println);
            }//fin caso 2
            case 3->{
                System.out.println("hasta pronto!!");
                salir = true;

            }//fin caso 3
            default -> System.out.println("opcion incorrecta: "+opcion);
        }//fin switch
        return salir;
    }//fin metodo ejec.
}