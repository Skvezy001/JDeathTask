package controller.dao;


import controller.dao.daoImpl.AccountDaoImpl;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

public class AccountDaoImplTest {
    private AccountDao accountDao;

    @Before
    public void init(){
        accountDao = new AccountDaoImpl();
    }

    @After
    public void shotDown(){
        accountDao = null;
    }

    @Test
    public void getAllAccountTest() throws SQLException {
        assertEquals("id:  1 | Account number:  12345 | User id: 1</br>" +
                "id:  2 | Account number:  12346 | User id: 2</br>" +
                "id:  3 | Account number:  12347 | User id: 3</br>" +
                "id:  4 | Account number:  12348 | User id: 4</br>",
                accountDao.getAllAccounts().accountsToString());
    }
}
