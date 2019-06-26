package dao;

import java.sql.SQLException;

public interface UserDao {
    String getUserById(String id) throws SQLException;
}
