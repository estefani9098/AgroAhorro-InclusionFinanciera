package control;

import Model.Conexion;
import java.sql.*;

public class MetaAhorroControlador {

    public void listarMetas() {
        try {
            Connection conn = Conexion.obtenerConexion();
            String sql = "SELECT * FROM MetaAhorro";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Meta: " + rs.getString("Met_Nombre") +
                                   " | Ahorro: " + rs.getDouble("Met_Ahorro"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error al listar metas: " + e.getMessage());
        }
    }
}
