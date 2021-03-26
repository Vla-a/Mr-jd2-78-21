package by.it_academy.jd2.web.servlets;

import by.it_academy.jd2.core.Model;
import by.it_academy.jd2.core.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AddServlet", urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("webapp/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override

        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String name = req.getParameter("name");
            String password = req.getParameter("pass");
            User user = new User(name, password);
            Model model = Model.getInstance();
            model.add(user);

            req.setAttribute("userName", name);
            doGet(req, resp);
        }
    }

