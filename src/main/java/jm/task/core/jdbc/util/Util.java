package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public Connection getConnect() {
          Connection connection = null;
//        Statement statement = null;
        try{
          Driver driver = new com.mysql.cj.jdbc.Driver();
          DriverManager.registerDriver(driver);
          connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
//          statement = connection.createStatement();;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
        return connection;
    }// реализуйте настройку соединения с БД
}
