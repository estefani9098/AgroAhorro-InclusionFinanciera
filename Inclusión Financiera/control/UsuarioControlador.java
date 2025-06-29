package control;

import Model.Conexion;
import java.sql.*;

public class UsuarioControlador {
    public void listarUsuarios() {
        try {
            Connection conn = Conexion.obtenerConexion();
            String sql = "SELECT * FROM Usuario";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getString("ID_Usuario") +
                        " | Nombre: " + rs.getString("Usu_Nombre") +
                        " | Apellido: " + rs.getString("Usu_Apellido"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error al listar usuarios: " + e.getMessage());
        }
    }
}

