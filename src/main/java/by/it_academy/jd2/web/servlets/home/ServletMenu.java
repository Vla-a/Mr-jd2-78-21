package by.it_academy.jd2.web.servlets.home;

import by.it_academy.jd2.core.dto.vui.Constants;
import by.it_academy.jd2.core.dto.vui.DataMessage;
import by.it_academy.jd2.core.dto.vui.DataStorageUsers;
import by.it_academy.jd2.core.dto.vui.Message;
import by.it_academy.jd2.core.dto.vui.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;




@WebServlet(name = "Menu", urlPatterns = "/menu")
public class ServletMenu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/indexMenu.jsp").forward(req, resp);
    }
}
