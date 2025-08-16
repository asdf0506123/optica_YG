package modelo;

import controlador.Servicio;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
import java.sql.ResultSet; //recibe la respuesta de las consultas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; //permite mandar el codigo sql atraves del java
public class Conexion3 {
    
    Connection conexion = null;
    
    private void conectarOptica(){
        try{
            String url = "jdbc:mysql://localhost:3306/optica_yg";//direccion del servidor, puerto que escucha y nombre de la base
            String usuario = "root";//usuario que se conecta a la base
            String password = "";//contrasena del usuario que se conecta
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void cerrarOptica() throws SQLException{
        conexion.close();
    }
    
    public ResultSet obtenerTodoServicio(){
        conectarOptica();
        ResultSet resultado = null;
       try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from servicio";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public void agregarServicio(Servicio x){
        try{
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query ="insert into servicio (nombreservicio, precio)"
                    + " values ('"+x.nombreServicio+"',"+x.precio+")";
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Servicio agregado con exito");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    //esta funcion recibe el id del servicio y elimina de la base de datos
    public void eliminarServicio(int idservicio){
        try {
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query = "delete from servicio where idservicio="+idservicio;
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Servicio eliminado con exito!");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e){
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void modificarServicio(Servicio x){
    try {
        conectarOptica();
        Statement instruccion = conexion.createStatement();
        String query = "UPDATE servicio SET nombreServicio='" + x.nombreServicio + "',"
                + " precio=" + x.precio +" "
                + "WHERE idservicio=" + x.idservicio;
        instruccion.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Datos del servicio actualizados");
        instruccion.close();
        cerrarOptica();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
    }
}


    public ResultSet buscarServicioNombre(String nombreServicio) {
        conectarOptica();
        ResultSet resultado = null;
        try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from servicio where nombreServicio like '%"+nombreServicio+"%'";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
}