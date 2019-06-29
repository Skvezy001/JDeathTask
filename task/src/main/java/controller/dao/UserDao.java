package controller.dao;

import model.User;

import java.sql.SQLException;

public interface UserDao {
    User getUserById(String id) throws SQLException;
}
