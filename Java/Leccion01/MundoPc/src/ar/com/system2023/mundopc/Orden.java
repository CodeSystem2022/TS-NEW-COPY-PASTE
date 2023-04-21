
package ar.com.system2023.mundopc;


public class Orden {
    private final int idOrden;
    //arreglo de objetos
    private Computadora computadora[];
    private static int contadorOrdenes;
    private static  final int  MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    //constructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
        
    }
    //METODO PARA AGREGAR UNA NUEVA COMPUTADORA AL ARREGLO
    
    public  void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else {
            System.out.println("has superado el limite : "+ Orden.MAX_COMPUTADORAS);
        }
        
    }
    //mostrar orden
    public void mostrarOrden(){
            System.out.println("Orden #: "+ this.idOrden);
            System.out.println("computadora de la orden # : "+this.idOrden);
            
            for(int i = 0;i < this.contadorComputadora;i++){
                System.out.println(this.computadora[i]);
                
            }
                
}
}
