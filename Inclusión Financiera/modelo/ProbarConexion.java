
package Model;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ProbarConexion 
{
    public static void main(String[] args) 
    {
        Conexion cn = new Conexion();
        Connection conectar = cn.getConnection();

        if (conectar != null) {
            JOptionPane.showMessageDialog(null, "✅ Conexión establecida correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "❌ No se pudo conectar a la base de datos.");
        }
    }
    
}
