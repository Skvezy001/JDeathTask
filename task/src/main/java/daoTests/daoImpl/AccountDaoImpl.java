package daoTests.daoImpl;

import daoTests.AccountDao;
import dbLogic.DBConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {

    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public String getAllAccounts() throws SQLException {
        String str = "";
        DBConnect dbConnect = new DBConnect();
        dbConnect.getConnect();
        preparedStatement = dbConnect.getConnection().prepareStatement("select * from account");
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            str += resultSet.getInt("id") + ":" + resultSet.getInt("account") +
                    ":" + resultSet.getInt("userid") + "  |  ";
        }
        dbConnect.closeConnect(preparedStatement);
        return str;
    }
}
