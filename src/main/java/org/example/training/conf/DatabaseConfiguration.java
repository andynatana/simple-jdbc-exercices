package org.example.training.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "root";
        String password = "pass";
        return DriverManager.getConnection(url, user, password);
    }
}
