package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MySql", "root", "KataJava1024");
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() throws SQLException {
        List <User> users = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, lastName, age FROM User");

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String lastName = resultSet.getString("lastName");
            byte age = resultSet.getByte("age");
            users.add(new User(name, lastName, age));
        }
        return users;
    }


    public void cleanUsersTable() {

    }
}
