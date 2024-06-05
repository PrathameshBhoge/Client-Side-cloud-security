/**
 * @author Varun Dhall
 * All Rights Reserved.
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {

    static Connection con = null;
    PreparedStatement pst = null;

    public static Connection makeConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cryptography", "root", "abc123");

        } catch (Exception e) {
        }
        return con;
    }
}