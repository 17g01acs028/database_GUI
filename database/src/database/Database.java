
package database;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
public static void main(String[] args) throws SQLException {
   /* try {
       Process p =Runtime.getRuntime().exec("C:\\xampp\\xampp-control.exe");
   } catch (IOException ex) {
       Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }*/
     create_database tb=new create_database();  
     tb.setVisible(true);
    }
    
}
