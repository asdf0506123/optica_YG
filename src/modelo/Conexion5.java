
package modelo;

import controlador.Ventas;
import controlador.Ventas2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion5 {
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
    
    public ResultSet obtenerTodoVentasSer(){
        conectarOptica();
        ResultSet resultado = null;
       try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from ventaservicio";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public ResultSet obtenerTodoVentasProd(){
        conectarOptica();
        ResultSet resultado = null;
       try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from ventaproducto";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public ResultSet buscarVenta1Nombre(String nombreVenta1) {
        conectarOptica();
        ResultSet resultado = null;
        try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from ventaservicio where cliente like '%"+nombreVenta1+"%'";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public ResultSet buscarVenta2Nombre(String nombreVenta2) {
        conectarOptica();
        ResultSet resultado = null;
        try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from ventaproducto where cliente like '%"+nombreVenta2+"%'";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
}
