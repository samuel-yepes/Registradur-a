
package mdRegistraduria;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ConexionRegistroSocial{
    
    public static final String url = "jdbc:mysql://localhost:3306/registraduria";
    public static final String username = "root";
    public static final String password = "samuel";
    
    // METODO PARA HACER LA CONEXION
    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException s) {
            System.out.println("error en " + s);
        }
        return con;
    }
}
