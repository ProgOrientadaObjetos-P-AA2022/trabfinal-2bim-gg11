package Paquete02;

import Paquete01.PlanPostpagoMinMegEco;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Enlace4 {

    private Connection conn;

    public void establecerConexion() {
        try {
            String url = "jdbc:sqlite:bd/PlanPostPagoMinMegasEco.db";
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinMegEco(PlanPostpagoMinMegEco c) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEco (Nombre,"
                    + "Cedula, Ciudad, Marca, Modelo, Numero, Minutos, CostoXMinuto,"
                    + "Gigas, CostoXGiga, Descuento, PagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d',"
                    + "'%.2f', '%d', '%.2f', '%d', '%.2f')",
                    c.obtenerNombre(), c.obtenerCedula(),
                    c.obtenerCiudad(), c.obtenerMarca(),
                    c.obtenerModelo(), c.obtenerNumero(),
                    c.obtenerMin(), c.obtenerCostoMin(),
                    c.obtenerGigas(), c.obtenerCostoXGiga(),
                    c.obtenerPorctjDscto(), c.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();

        } catch (SQLException e) {
            System.err.println("Error al insertar PlanPostpagoMinMegEco");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanPostpagoMinMegEco> obtenerDataPppmmEco() {
        ArrayList<PlanPostpagoMinMegEco> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegasEco ;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostpagoMinMegEco c = new PlanPostpagoMinMegEco(
                        rs.getInt("Minutos"), rs.getDouble("CostoXMinuto"),
                        rs.getInt("Gigas"), rs.getDouble("CostoXGiga"),
                        rs.getInt("Descuento"), rs.getString("Nombre"),
                        rs.getString("Cedula"), rs.getString("Ciudad"),
                        rs.getString("Marca"), rs.getString("Modelo"),
                        rs.getString("Numero"));
                lista.add(c);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Error al obtener PlanPostpagoMinMegEco");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
