
package domain;


public class Persona {
    private final int idPersona;
    private static  int contadorPersonas;
    //bloque de inicializacion estatico
    static {
        System.out.println("ejecucion del bloque estatico");
        ++Persona.contadorPersonas;
    }
    //bloque inicializacion no estatico o contexto dinamico
    {
        System.out.println("ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    //LOS BLOQUES DE INICIALIZACION SE EJECUTAN ANTES DEL CONSTRUCTOR
    
    public Persona(){
        System.out.println("ejecucion constructor");
    }
    public  int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
