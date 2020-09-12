
package DataBase;


import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewMain {

    public static void main(String[] args) {
        final String dburl="jdbc:mysql://localhost:3306/test";
        String uname="root";
        String pword="";
        
        String q="SELECT id FROM student WHERE name='mihtun'";
        
        try {
            
            Connection cn = DriverManager.getConnection(dburl, uname, pword);
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(q);
            System.out.println("Success!");
            while(rs.next()){
                System.out.println(rs.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
