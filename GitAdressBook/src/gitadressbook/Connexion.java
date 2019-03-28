/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitadressbook;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stag
 */
public class Connexion {

    Connection con;
//    String host = "localhost";
//    String port = "3306";
//    String base = "carnet_adresse";

    public Connexion(){
        
                    
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Chargé");
            //String url = "jdbc:mysql://" + host + ":" + port + "/" + base;

            String url;
            url = "jdbc:mysql://localhost:3306/carnet_adresse";
            String login = "root";
            String password = "1234512345";
            con = DriverManager.getConnection(url, login, password);

        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConnexion() {
        return con;
    }
}
