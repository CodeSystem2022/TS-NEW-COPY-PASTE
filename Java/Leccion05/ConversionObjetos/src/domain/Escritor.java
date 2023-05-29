
package domain;

 
public class Escritor extends Empleado{
    final  TipoEscritura tipoEscritura;
    public Escritor(String nombre, double sueldo,TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura=tipoEscritura;
        
    }
    //METODO PARA SOBREESCRIBIR
    @Override
    public  String obtenerDetalles(){
        return super.obtenerDetalles()+",tipo escritura: "+tipoEscritura.getDescripcion();
    }
    @Override
    public String toString(){
        return "ESCRITOR{" + "tipoEscritura="+ tipoEscritura +"}"+" "+super.toString();
    }
    public  TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
