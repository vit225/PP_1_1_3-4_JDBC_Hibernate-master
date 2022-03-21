package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 25);
        userService.saveUser("Петя", "Петров", (byte) 30);
        userService.saveUser("Сергей", "Сергеев", (byte) 35);
        userService.saveUser("Николай", "Николаев", (byte) 31);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
