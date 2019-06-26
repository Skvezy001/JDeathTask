package servlets;

import dao.AccountDao;
import dao.daoImpl.AccountDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/accounts")
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        AccountDao accountDao = new AccountDaoImpl();
        String string = "";
        try{
             string = accountDao.getAllAccounts();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        resp.getWriter().write("<html>"+
                "<body>" +
                "<h2>Hello JDeath!</h2>" +
                string +
                "</body>" +
                "</html>"
        );
    }
}
