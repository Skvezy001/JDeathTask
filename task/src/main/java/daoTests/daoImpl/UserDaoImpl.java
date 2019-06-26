package daoTests.daoImpl;

import daoTests.UserDao;
import dbLogic.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public String getUserById(String id) throws SQLException{

        String str = "";

        DBConnect dbConnect = new DBConnect();
        dbConnect.getConnect();
        preparedStatement = dbConnect.getConnection().prepareStatement("select * from users where id = " + id);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            str += resultSet.getString("name") + " " + resultSet.getString("sureName");
        }
        dbConnect.closeConnect(preparedStatement);
        return str;
    }
}
