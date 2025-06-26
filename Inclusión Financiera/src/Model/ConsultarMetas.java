
package Model;
import java.sql.*;
public class ConsultarMetas {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://LAPTOP-1U6TKV21\\SQLEXPRESS01:1433;databaseName=bdinclusionfinanciera;encrypt=true;trustServerCertificate=true";
        String usuario = "Diana7347";
        String contraseña = "MiClave2025*";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {

            CallableStatement procedimiento = conexion.prepareCall("{call sp_ConsultarMetas}");
            ResultSet resultado = procedimiento.executeQuery();

            while (resultado.next()) {
                String id = resultado.getString("ID_MetaAhorro");
                String nombre = resultado.getString("Met_Nombre");
                double ahorro = resultado.getDouble("Met_Ahorro");
                String estado = resultado.getString("Met_Estado");
                Date fechaLimite = resultado.getDate("Met_FechaLimite");
                double montoActual = resultado.getDouble("Met_Montoactual");
                String idUsuario = resultado.getString("ID_Usuario");

                System.out.println("ID Meta: " + id + " | Nombre: " + nombre + " | Ahorro meta: " + ahorro +
                        " | Estado: " + estado + " | Fecha Límite: " + fechaLimite +
                        " | Monto actual: " + montoActual + " | Usuario: " + idUsuario);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al consultar metas: " + e.getMessage());
        }
    }
}
