package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //variables para conectarnos a la base de datos
        var baseDatos = "estudiantes";
        var url  = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "Matias818182";

        //cargamosla clase del driver de mysql en la memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion= DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("ocurrio un error en la conecxion: "+e.getMessage());
        }//fin catch
        return conexion;

    }//fin metodo conexion
}
