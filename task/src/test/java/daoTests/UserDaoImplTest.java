package daoTests;

import daoTests.daoImpl.UserDaoImpl;
import org.junit.*;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class UserDaoImplTest {

    private UserDao userDao;

    @Before
    public void init(){
        userDao = new UserDaoImpl();
    }

    @After
    public void shotDown(){
        userDao = null;
    }

    @Test
    public void getUserByIdTest() throws SQLException{
        assertEquals("Nikita Ershov", userDao.getUserById("1"));
    }

}
