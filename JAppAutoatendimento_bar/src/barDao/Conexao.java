package barDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Rosa
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String User = "root";
    
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String Senha = "";
    
    public static void executar(String query){
        try {
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(URL, User, Senha);
            Statement st = conn.createStatement();
            st.execute(query);
            conn.close();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static ResultSet consultar (String query){
        try {
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(URL, User, Senha);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
            }
        }
    
}