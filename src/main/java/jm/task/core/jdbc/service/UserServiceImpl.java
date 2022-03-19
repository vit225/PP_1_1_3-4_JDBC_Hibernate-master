package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.Dao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    Dao dao = new Dao();

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {
        try {
            dao.saveUser(name, lastName, age);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() throws SQLException {
       return dao.getAllUsers();
    }


    public void cleanUsersTable() {

    }
}
