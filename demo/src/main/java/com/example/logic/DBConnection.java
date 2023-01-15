package com.example.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    public void ConnectionToDatabase() {
        try (Connection db = DriverManager.getConnection("jdbc:sqlserver://aei-sql2.avans.nl:1443;databaseName=Peppernuts",
                "pepper", "Welkom01!")) {
            PreparedStatement query = db.prepareStatement("SELECT * FROM Cursist");
            ResultSet result = query.executeQuery();
            while (result.next()) {
                String Adres = result.getString("Adres");
                System.out.println(Adres);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
