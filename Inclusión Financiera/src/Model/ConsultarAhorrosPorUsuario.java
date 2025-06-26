
package Model;
import java.sql.*;
import java.util.Scanner;
public class ConsultarAhorrosPorUsuario {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://LAPTOP-1U6TKV21\\SQLEXPRESS01:1433;databaseName=bdinclusionfinanciera;encrypt=true;trustServerCertificate=true";
        String usuario = "Diana7347";
        String contraseña = "MiClave2025*";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del usuario (ej. USU-0001): ");
        String idUsuario = scanner.nextLine();

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {

            CallableStatement procedimiento = conexion.prepareCall("{call sp_ConsultarAhorrosPorUsuario(?)}");
            procedimiento.setString(1, idUsuario);
            ResultSet resultado = procedimiento.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("Usu_Nombre");
                String meta = resultado.getString("Met_Nombre");
                double monto = resultado.getDouble("Aho_Monto");
                Date fecha = resultado.getDate("Aho_Fecha");
                String progreso = resultado.getString("Aho_Progreso");

                System.out.println("Usuario: " + nombre + " | Meta: " + meta + " | Monto: " + monto +
                        " | Fecha: " + fecha + " | Progreso: " + progreso);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al consultar ahorros por usuario: " + e.getMessage());
        }
    }
}

