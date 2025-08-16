/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Producto;
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
public class Conexion2 {
    
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
    
    public ResultSet obtenerTodoProducto(){
        conectarOptica();
        ResultSet resultado = null;
       try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from producto";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
    
    public void agregarProducto(Producto x){
        try{
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query ="insert into producto (nombreProducto, precioUnitario, precioMayoreo, cantidadMayoreo)"
                    + " values ('"+x.nombreProducto+"',"+x.precioUnitario+","+x.precioMayoreo+",'"+x.cantidadMayoreo+"')";
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Producto agregado con exito");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    //esta funcion recibe el id del cliente y elimina de la base de datos
    public void eliminarProducto(int idproducto){
        try {
            conectarOptica();
            Statement instruccion = conexion.createStatement();
            String query = "delete from producto where idproducto="+idproducto;
            instruccion.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Producto eliminado con exito!");
            instruccion.close();
            cerrarOptica();
        } catch (Exception e){
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    public void modificarProducto(Producto x){
    try {
        conectarOptica();
        Statement instruccion = conexion.createStatement();
        String query = "UPDATE producto SET nombreProducto='" + x.nombreProducto + "',"
                + "precioUnitario=" + x.precioUnitario+ ", precioMayoreo=" + x.precioMayoreo + ","
                + "cantidadMayoreo='" + x.cantidadMayoreo +"'"
                + "WHERE idproducto=" + x.idproducto;
        instruccion.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Datos del producto actualizados");
        instruccion.close();
        cerrarOptica();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
    }
}


    public ResultSet buscarProductoNombre(String nombreProducto) {
        conectarOptica();
        ResultSet resultado = null;
        try {
        Statement instruccion = conexion.createStatement();
        String query ="select * from producto where nombreProducto like '%"+nombreProducto+"%'";
        resultado = instruccion.executeQuery(query);
       } catch (Exception e){
       }
       return resultado;
    }
}
