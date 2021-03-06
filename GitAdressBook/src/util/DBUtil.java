/*
 *  Connexion base de données
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stag
 */
public class DBUtil {

    private static Connection con;
    private static final String url = "jdbc:mysql://localhost:3306/carnet_adresse";
    private static final String login = "root";
    private static final String password = "1234512345";

    public static Connection connexion() throws SQLException {

        try {

            con = DriverManager.getConnection(url, login, password);
            System.out.println("Driver Chargé");

        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return con;
    }

    public static void deconnexion() throws SQLException {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }

}
