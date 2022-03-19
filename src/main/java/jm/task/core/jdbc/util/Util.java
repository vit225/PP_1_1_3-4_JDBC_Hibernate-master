package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String url = "jdbc:mysql://127.0.0.1:3306/MySql";
    private static String user = "root";
    private static String password = "KataJava1024";

    public static Connection createConnection() {
        Connection connection = null;

        {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void closeConnection () {

    }
}
