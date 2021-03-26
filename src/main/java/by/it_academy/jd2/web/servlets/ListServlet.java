package by.it_academy.jd2.web.servlets;

import by.it_academy.jd2.core.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns = "/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<String> names = model.list();
        req.setAttribute("userNames", names);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("webapp/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    @WebServlet(name = "PrintServlet", urlPatterns = "/test1")
    public static class PrintServlet extends  HttpServlet {


            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

                resp.setContentType("text1/html");
                PrintWriter writer = resp.getWriter();

                Enumeration<String> params = req.getParameterNames();

                while (params.hasMoreElements()) {
                    String paramName = params.nextElement();

                    writer.write("<p>" + paramName + ": " + req.getParameterNames() + "</p>");

                }
            }
        }
}

