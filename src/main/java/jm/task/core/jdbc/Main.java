package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
       UserService userService = new UserServiceImpl();
       userService.cleanUsersTable();

//        userService.createUsersTable();
//        try {
//            userService.saveUser("name1","lastName1", (byte) 20);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
