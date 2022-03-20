package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.*;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoJDBCImpl = new UserDaoJDBCImpl();

    public void createUsersTable() {
        try {
            userDaoJDBCImpl.createUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoJDBCImpl.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) {
        try {
            userDaoJDBCImpl.removeUserById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<User> getAllUsers() throws SQLException {
       return userDaoJDBCImpl.getAllUsers();
    }


    public void cleanUsersTable() {

    }
}
