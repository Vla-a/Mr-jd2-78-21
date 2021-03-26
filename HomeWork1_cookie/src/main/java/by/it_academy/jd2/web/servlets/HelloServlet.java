package by.it_academy.jd2.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/heo")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: blue;'>Hello, " + lastName + " " + firstName + "!</span></p>");



    }
}
