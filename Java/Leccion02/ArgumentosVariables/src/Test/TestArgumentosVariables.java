
package Test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("juan","Perez", 7,8,9);
        
    }
    private static void variosParametros(String nombre,String apellido,int ...numeros){
        System.out.println("nombre: "+nombre+" "+apellido);
        
        imprimirNumeros(numeros);
    }
    //argumentos variables ...; se va a convertir en un arreglo
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: "+numeros[i]);
            
        }
        
        
    }
    
}
