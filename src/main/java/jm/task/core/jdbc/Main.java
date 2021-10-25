package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userServiceimpl = new UserServiceImpl();

        userServiceimpl.createUsersTable();
        userServiceimpl.createUsersTable();
        userServiceimpl.saveUser("Name1", "Lastname1", (byte) 21);
        userServiceimpl.saveUser("Name2", "Lastname2", (byte) 22);
        userServiceimpl.saveUser("Name3", "Lastname3", (byte) 23);
        userServiceimpl.saveUser("Name4", "Lastname4", (byte) 24);
        userServiceimpl.getAllUsers();
        userServiceimpl.removeUserById(2);
        userServiceimpl.getAllUsers();

        userServiceimpl.cleanUsersTable();
        userServiceimpl.getAllUsers();
        userServiceimpl.dropUsersTable();
        userServiceimpl.dropUsersTable();

        // реализуйте алгоритм здесь
//        Создание таблицы User(ов)
//        Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
//        Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
//        Очистка таблицы User(ов)
//        Удаление таблицы
    }
}
