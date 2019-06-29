package controller.dao.daoImpl;

import controller.dao.UserDao;
import controller.dbLogic.DBConnect;
import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public User getUserById(String id) throws SQLException{
        DBConnect dbConnect = new DBConnect();
        dbConnect.getConnect();

        preparedStatement = dbConnect.getConnection().prepareStatement("select * from users where id = " + id);
        resultSet = preparedStatement.executeQuery();

        User user = new User(resultSet);

        dbConnect.closeConnect(preparedStatement);

        return user;
    }
}
