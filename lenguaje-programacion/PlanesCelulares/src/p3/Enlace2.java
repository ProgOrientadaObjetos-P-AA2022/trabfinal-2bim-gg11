
package p3;

import p2.PlanPostPagoMegas;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Enlace2 {
    
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanPostPagoMegas.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas pppm) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas (Nombre,"
                    + "Cedula, Ciudad, Marca, Modelo, Numero, Gigas, CostoXGiga,"
                    + "Tarifa, PagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d',"
                    + "'%.2f', '%.2f', '%.2f')", 
                    pppm.obtenerNombre(), pppm.obtenerCedula(), 
                    pppm.obtenerCiudad(), pppm.obtenerMarca(), 
                    pppm.obtenerModelo(), pppm.obtenerNumero(), 
                    pppm.obtenerGigas(), pppm.obtenerCostoXGiga(),
                    pppm.obtenerTarifaBase(), pppm.obtenerPagoMensual());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {  
             System.err.println("Error al insertar PlanPostPagoMegas");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMegas> obtenerDataPppMegas() {  
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMegas ;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                
                PlanPostPagoMegas miPppm = new PlanPostPagoMegas(
                rs.getInt("Gigas"), rs.getDouble("CostoXGiga"), 
                rs.getDouble("Tarifa"), rs.getString("Nombre"),
                rs.getString("Cedula"), rs.getString("Ciudad"),
                rs.getString("Marca"), rs.getString("Modelo"),
                rs.getString("Numero"));
                lista.add(miPppm);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Error al obtener PlanPostPagoMegas");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}  
