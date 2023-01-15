package com.example;

import com.example.logic.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        dbConnection.ConnectionToDatabase();

    }

}
