package control;

import Model.Conexion;
import java.sql.*;

public class AhorroControlador {

    public void listarAhorros() {
        try {
            Connection conn = Conexion.obtenerConexion();
            String sql = "SELECT * FROM Ahorro";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Monto: " + rs.getDouble("Aho_Monto") +
                                   " | Fecha: " + rs.getString("Aho_Fecha"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error al listar ahorros: " + e.getMessage());
        }
    }
}
