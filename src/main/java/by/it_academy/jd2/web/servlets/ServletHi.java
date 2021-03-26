package by.it_academy.jd2.web.servlets;


import by.it_academy.jd2.core.Usersss;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;





    @WebServlet(name = "ServletHi", urlPatterns = "/hi")
    public class ServletHi extends HttpServlet {

        private Usersss hel = new Usersss();

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/hi.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String name = req.getParameter("name");
            if (name.equals("exit")) {
                final HttpSession session = req.getSession();
                session.setAttribute("list", hel.getAll().toString());
                getServletContext().getRequestDispatcher("/his.jsp").forward(req, resp);
            } else {
                hel.add(name);
                getServletContext().getRequestDispatcher("/hi.jsp").forward(req, resp);

            }
        }
    }