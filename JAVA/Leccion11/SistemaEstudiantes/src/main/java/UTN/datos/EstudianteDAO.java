package UTN.datos;
import static UTN.conexion.Conexion.getConnection;
import UTN.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //METODO LISTAR
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //creamos algunos objetos para comunicar con la base de datos
        //envia la sentencia a la base de datos
        PreparedStatement ps;
        //obtenenmos  el resultado de la base de datos
        ResultSet rs;
        //creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //falta AGREGARLO A LA LISTA
                estudiantes.add(estudiante);



            }
        }catch (Exception e){
            System.out.println("ocurrio un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("ocurrio un erro  al cerrar la conexion: "+e.getMessage());
            }
        }//fiin finally
        return estudiantes;

    }//fin metodo listar

    //metodo por id->fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;//se enconro un registro
            }//fin if
        }catch (Exception e){
            System.out.println("ocurrio un error al buscar estudiante: "+e.getMessage());

        }//fin catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("ocurrio un erro al cerrar conecxion: "+e.getMessage());
            }

        }//fin finally
        return  false;
    }
    //metodoagregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql ="INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("ocurrio un error al agregar al estudiante: "+e.getMessage());

        }//fin catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("ocurrio un erro al cerrar conecxion: "+e.getMessage());
            }//fin catch

        }//fin finally
        return false;

    }//fin metodo agregar estudiante
    //metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante ){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql ="UPDATE  estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("ocurrio un error modificar estudiante: "+e.getMessage());
        }//fin catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("ocurrio un erro al cerrar conecxion: "+e.getMessage());
            }//fin catch
        }//fin finally
        return false;
    }//fin metodo modificar estudiante

    public static void main(String[] args) {
        //modificar estudiante
        var estudianteDAO = new EstudianteDAO();

        var estudianteModificado = new Estudiante(1, "JUAN CARLOS", "JUAREZ", "4121316341", "JUANJUAREZ@GMAIL.COM");
        var modificado = estudianteDAO.modificarEstudiante(estudianteModificado);
        if(modificado)
            System.out.println("estudiante modificado: "+estudianteModificado);
        else
            System.out.println("no se ha modificado estudiante: "+estudianteModificado);

        //listar estudiantes

        System.out.println("listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDAO.listarEstudiantes();
        estudiantes.forEach(System.out::println);//funcion lambda para imprimir
        //agregar estudiante
        var nuevoEstudiante = new Estudiante("CARLOS", "LARA", "1313131", "CARLOSLARA@GMAIL.COM");
        var agregado = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("estudiante agregado: "+nuevoEstudiante);
        else
            System.out.println("no se ha agregado estudiante: "+nuevoEstudiante);


        //Buscar por id
        var estudiante1 = new Estudiante(1);
        System.out.println("estudiante antes de la busqueda: "+estudiante1);
        var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante1);
        if(encontrado)
            System.out.println("estudiante encontrado: "+estudiante1);
        else
            System.out.println("no se encontro el estudiante: "+estudiante1.getIdEstudiante());

    }

}
