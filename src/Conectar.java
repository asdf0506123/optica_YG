/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class Conectar {
    public static void main(String[] args){
        try {
            String url = "jdbc:mysql://localhost:3306/optica_yg";//direccion del servidor, puerto que escucha y nombre de la base
            String usuario = "root";//usuario que se conecta a la base
            String password = "";//contrasena del usuario que se conecta
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");
            
            Statement instruccion = conexion.createStatement();
            String query ="select * from factura";
            ResultSet resultado = instruccion.executeQuery(query);
            
            while(resultado.next()){
                System.out.println("ID: "+resultado.getInt("idfactura")+" Nombre: "+resultado.getString("nombre")); 
            }
            resultado.close();
            conexion.close();
            instruccion.close();
            System.out.println("Desconectado");
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
