package bank.management.system;

import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            // Driver register panrom
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database connection - Unga password-ah 'root' edathula podunga
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Kishorekk01@"); 
            s = c.createStatement();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
