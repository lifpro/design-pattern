package com.technolabista;

import com.technolabista.singleton.DatabaseConnection;
import com.technolabista.singleton.Singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
            Connection connection = databaseConnection.getConnection();

            // Utilisez la connexion pour vos opérations de base de données
            // Exemple : créer une déclaration et exécuter une requête SQL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("column_name"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
