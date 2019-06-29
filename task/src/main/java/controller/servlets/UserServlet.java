package controller.servlets;

import controller.dao.UserDao;
import controller.dao.daoImpl.UserDaoImpl;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/userById")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        UserDao userDao = new UserDaoImpl();
          User user = new User();
        try{
            user = userDao.getUserById(req.getParameter("id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        resp.getWriter().write("<html>"+
                "<body>" +
                "<h2>Hello JDeath!</h2>" +
                "<form action='/userById' method='get'>" +
                "<input type='text' name='id'/> </br></br>" +
                "<input type='submit'></br></br>" +
                user.getName() + "  " + user.getSureName() +
                "</form>" +
                "</body>" +
                "</html>"
        );
    }

}
