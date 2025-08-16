
package modelo;

import controlador.Proveedor;
import javax.swing.JOptionPane;

import java.sql.ResultSet; //recibe la respuesta de las consultas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; //permite mandar el codigo sql atraves del java
public class Conexion4 {
    
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
    
    public ResultSet obtenerTodoProveedor(){
        conectarOptica();
        ResultSet resultado = null;
       try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from proveedor";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public void agregarProveedor(Proveedor x){
        try{
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query ="insert into proveedor (nombreProveedor, calle, numero, ciudad, referencia, contacto)"
                    + " values ('"+x.nombreProveedor+"','"+x.calle+"',"+x.numero+",'"+x.ciudad+"','"+x.referencia+"','"+x.contacto+"')";
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Proveedor agregado con exito");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void eliminarProveedor(int idproveedor){
        try {
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query = "delete from proveedor where idproveedor="+idproveedor;
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito!");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e){
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void modificarProveedor(Proveedor x){
    try {
        conectarOptica();
        Statement instruccion = conexion.createStatement();
        String query = "UPDATE proveedor SET nombreProveedor='" + x.nombreProveedor + "',"
                + "calle='" + x.calle + "', numero=" + x.numero + ","
                + "ciudad='" + x.ciudad + "', referencia='" + x.referencia + "', "
                + "contacto='" + x.contacto +"' "
                + "WHERE idproveedor=" + x.idproveedor;
        instruccion.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Datos del proveedor actualizados");
        instruccion.close();
        cerrarOptica();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
    }
}


    public ResultSet buscarProveedorNombre(String nombreProveedor) {
        conectarOptica();
        ResultSet resultado = null;
        try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from proveedor where nombreProveedor like '%"+nombreProveedor+"%'";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
}
