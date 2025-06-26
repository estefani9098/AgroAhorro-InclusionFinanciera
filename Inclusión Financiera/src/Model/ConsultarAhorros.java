
package Model;
import java.sql.*;
public class ConsultarAhorros {

    public static void main(String[] args) {
        
        String url = "jdbc:sqlserver://LAPTOP-1U6TKV21\\SQLEXPRESS01:1433;databaseName=bdinclusionfinanciera;encrypt=true;trustServerCertificate=true";
        String usuario = "Diana7347";
        String contraseña = "MiClave2025*";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {

            CallableStatement procedimiento = conexion.prepareCall("{call sp_ConsultarAhorros}");
            ResultSet resultado = procedimiento.executeQuery();

            while (resultado.next()) {
                String id = resultado.getString("ID_Ahorro");
                double monto = resultado.getDouble("Aho_Monto");
                Date fecha = resultado.getDate("Aho_Fecha");
                String progreso = resultado.getString("Aho_Progreso");
                String idMeta = resultado.getString("ID_MetaAhorro");

                System.out.println("ID Ahorro: " + id + " | Monto: " + monto + " | Fecha: " + fecha +
                        " | Progreso: " + progreso + " | Meta: " + idMeta);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al consultar ahorros: " + e.getMessage());
        }
    }
}

