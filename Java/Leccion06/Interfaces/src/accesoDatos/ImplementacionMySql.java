
package accesoDatos;

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        
        System.out.println("insertar de MySql");
    }

    @Override
    public void listar() {
        
        System.out.println("listar de MySql");

    }

    @Override
    public void actualizar() {
       System.out.println("actualizar de MySql");

    }

    @Override
    public void eliminar() {
         System.out.println("eliminar de MySql");

    }
    
    
}
