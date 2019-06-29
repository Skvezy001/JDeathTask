package controller.dao;

import model.Account;

import java.sql.SQLException;

public interface AccountDao {
    Account getAllAccounts() throws SQLException;
}
