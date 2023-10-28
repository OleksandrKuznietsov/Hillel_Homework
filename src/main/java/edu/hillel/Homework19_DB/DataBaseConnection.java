package edu.hillel.Homework19_DB;

import java.sql.*;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/homework19";
    private static final String USER = "root";
    private static final String Password = "alexsql_66282770_x";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, Password);
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

