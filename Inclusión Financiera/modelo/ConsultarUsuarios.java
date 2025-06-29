
package Model;
import java.sql.*;
public class ConsultarUsuarios {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://LAPTOP-1U6TKV21\\SQLEXPRESS01:1433;databaseName=bdinclusionfinanciera;encrypt=true;trustServerCertificate=true";
        String usuario = "Diana7347";
        String contraseña = "MiClave2025*";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {

            CallableStatement procedimiento = conexion.prepareCall("{call sp_ConsultarUsuarios}");
            ResultSet resultado = procedimiento.executeQuery();

            while (resultado.next()) {
                String id = resultado.getString("ID_Usuario");
                String nombre = resultado.getString("Usu_Nombre");
                String apellido = resultado.getString("Usu_Apellido");
                String correo = resultado.getString("Usu_Gmail");
                String telefono = resultado.getString("Usu_Telefono");

                System.out.println("ID: " + id + " | Nombre: " + nombre + " " + apellido + " | Correo: " + correo + " | Teléfono: " + telefono);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al consultar usuarios: " + e.getMessage());
        }
    }
}