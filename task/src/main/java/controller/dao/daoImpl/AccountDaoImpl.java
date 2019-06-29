package controller.dao.daoImpl;

import controller.dao.AccountDao;
import controller.dbLogic.DBConnect;
import model.Account;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {

    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public Account getAllAccounts() throws SQLException {
        DBConnect dbConnect = new DBConnect();
        dbConnect.getConnect();

        preparedStatement = dbConnect.getConnection().prepareStatement("select * from account");
        resultSet = preparedStatement.executeQuery();

        Account account = new Account(resultSet);

        dbConnect.closeConnect(preparedStatement);

        return account;
    }
}
