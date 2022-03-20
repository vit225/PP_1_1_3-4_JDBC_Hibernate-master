package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    Connection connection = Util.createConnection();

    public void createUsersTable() throws SQLException {

        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS users " +
                "(id INT NOT NULL AUTO_INCREMENT,  firstName VARCHAR(255), lastName VARCHAR(255), age INT,PRIMARY KEY (id));";
        statement.executeUpdate(sql);


    }

    public void dropUsersTable() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "DROP TABLE IF EXISTS users";
        statement.executeUpdate(sql);
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO users(firstName, lastName, age) VALUES('" + name + "', '" + lastName + "', '" + age + "')";
        statement.executeUpdate(sql);
    }

    public void removeUserById(long id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
        preparedStatement.setLong(1, id);
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String name = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            byte age = resultSet.getByte("age");
            User user = new User(name, lastName, age);
            user.setId(id);
            users.add(user);
        }
        resultSet.close();
        return users;
    }

    public void cleanUsersTable() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "TRUNCATE  users";


        statement.executeUpdate(sql);
    }
}
