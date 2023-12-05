
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class DBConnection {
    
    public static Connection connect(){
        
        Connection con = null;
        String username = "root";
        String password = "";
        String dataCon = "jdbc:mysql://localhost:3306/swcar";
    
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(dataCon,username,password);
        JOptionPane.showMessageDialog(null, "Connected with db!");
        }catch (Exception e){
            System.out.println("The problem is " + e);
        }
        return con;
    }
    
}
