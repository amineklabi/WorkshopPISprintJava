/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.technique;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esprit
 */

/*
 * ConnectionFactory : Construction de la connexion
 * Respnsabilités : 
 *  1- retourner une instance de cette classe
 *    (l' instance charge le Driver et instancie l'attribut connection)
 *  2- Retourne l'attribut connection qui servira à la création des requêtes.
 */
public class ConnectionFactory {
    // les constantes de ConnectionFactory : user, password, url(servername+db schema)
    private String servername;
    private String db;
    private String password;
    private String username;
    /*ici nous fabriquons une connexions à la base "testdb"
      et d'utilisateur "root" dont le mot de passe est "root"
    */
    //attribut de type java.sql.Connection 
    private Connection connection;
    //attribut de test d'unicité
    private static ConnectionFactory instance;
    //le constructeur de la classe ConnectionFactory 
    //(fait appels à la classe DriverManager pour retourner une instance de Connection)
    private ConnectionFactory() {
        try {
            servername = "localhost";
            username = "root";
            password ="root";
            db = "stockdepot";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + servername + "/" + db, username, password);
            printConnectionInfo(connection);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ConnectionFactory getInstance(){
        if(instance == null) {
            instance = new ConnectionFactory();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    //la méthode printConnectionInfo affiche à l'écran les infomations relatives à la connection
    /*
      Exemple :
     Connected as : root@localhost  (database user)
               to : MySQL 5.1.61-community ( mysql server )
            using : MySQL-AB JDBC Driver 5.1 type 4.0 ( driver name, version and type)
     */
    public static void printConnectionInfo(Connection connection) throws SQLException{
        DatabaseMetaData databaseMetaData = connection.getMetaData();        
            StringBuilder sb = new StringBuilder(100);
            sb.append("Connected as : ").append(databaseMetaData.getUserName()).append("\n")
              .append("          to : ").append(databaseMetaData.getDatabaseProductName())
                                         .append(" ")
                                         .append(databaseMetaData.getDatabaseProductVersion())
                                         .append("\n")
              .append("       using : ")
              .append(databaseMetaData.getDriverName())
              .append(" ")
              .append(databaseMetaData.getDriverMajorVersion())
              .append(".")
              .append(databaseMetaData.getDriverMinorVersion())
              .append(" type ")
              .append(databaseMetaData.getJDBCMajorVersion())
              .append(".")
              .append(databaseMetaData.getJDBCMinorVersion())
              .append("\n");
          System.out.println(sb.toString());
    }
    
    
    
}
