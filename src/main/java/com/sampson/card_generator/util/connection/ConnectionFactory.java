package com.sampson.card_generator.util.connection;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    @Value("${DB_DATABASE}")
    private static String url;

    @Value("${DB_USER}")
    private static String user;

    @Value("${DB_PASSWORD}")
    private static String password;

    @Value("${DB_DRIVER}")
    private static String driver;
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
