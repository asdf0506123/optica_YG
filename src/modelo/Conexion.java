package modelo;

import controlador.Cliente;
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
public class Conexion {
    
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
    
    public ResultSet obtenerTodoCliente(){
        conectarOptica();
        ResultSet resultado = null;
       try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from cliente";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public void agregarCliente(Cliente x){
        try{
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query ="insert into cliente (nombreCompleto, calle, numero, ciudad, referencia, contacto, rfc)"
                    + " values ('"+x.nombreCompleto+"','"+x.calle+"',"+x.numero+",'"+x.ciudad+"','"+x.referencia+"','"+x.contacto+"','"+x.rfc+"')";
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    //esta funcion recibe el id del cliente y elimina de la base de datos
    public void eliminarCliente(int idcliente){
        try {
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query = "delete from cliente where idcliente="+idcliente;
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Cliente eliminado con exito!");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e){
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void modificarCliente(Cliente x){
    try {
        conectarOptica();
        Statement instruccion = conexion.createStatement();
        String query = "UPDATE cliente SET nombreCompleto='" + x.nombreCompleto + "',"
                + "calle='" + x.calle + "', numero=" + x.numero + ","
                + "ciudad='" + x.ciudad + "', referencia='" + x.referencia + "', "
                + "contacto='" + x.contacto + "', rfc='" + x.rfc + "' "
                + "WHERE idcliente=" + x.idcliente;
        instruccion.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Datos del cliente actualizados");
        instruccion.close();
        cerrarOptica();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
    }
}


    public ResultSet buscarClienteNombre(String nombreCliente) {
        conectarOptica();
        ResultSet resultado = null;
        try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from cliente where nombreCompleto like '%"+nombreCliente+"%'";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
}
