package by.it_academy.jd2.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.beans.Encoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "SessiaServlet", urlPatterns = "/sessi")
public class SesiaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        try {
            String fSess= getParameter(req,  firstName, "firstName");
            String lSess = getParameter(req,  lastName, "lastName");
            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();
            writer.write("<p><span style='color: red;'>Hello, " + fSess + " " + lSess + "!<p>");
        } catch (Exception e) {

            PrintWriter writer = resp.getWriter();
            writer.println("No one or two parametrs" );

        }
    }

    private String getParameter(HttpServletRequest req,  String value, String name) throws Exception {
        HttpSession sessia = req.getSession();


        if (value != null ) {

            sessia.setAttribute(name, value);

            return value;
        }else if(!sessia.isNew())            {

            value = sessia.getAttribute(name).toString();

            return value;
        }


        throw new IllegalArgumentException("No one or two parametrs");
    }
}
