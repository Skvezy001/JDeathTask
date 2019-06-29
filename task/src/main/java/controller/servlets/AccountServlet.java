package controller.servlets;

import controller.dao.AccountDao;
import controller.dao.daoImpl.AccountDaoImpl;
import model.Account;

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
        Account account = new Account();
        try{
             account = accountDao.getAllAccounts();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        resp.getWriter().write("<html>"+
                "<body>" +
                "<h2>Hello JDeath!</h2>" +
                account.accountsToString() +
                "</body>" +
                "</html>"
        );
    }
}
