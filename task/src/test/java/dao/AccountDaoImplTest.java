package dao;

import dao.daoImpl.AccountDaoImpl;
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
        assertEquals("1:12345:1  |  2:12346:2  |  3:12347:3  |  4:12348:4  |  ", accountDao.getAllAccounts());
    }
}
