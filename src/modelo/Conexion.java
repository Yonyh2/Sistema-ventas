package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_ventas";
    private static final String USER = "ventas_user";
    private static final String PASSWORD = "ventas123";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error de conexion:" + e.getMessage());
            return null;
        }
    }

}
