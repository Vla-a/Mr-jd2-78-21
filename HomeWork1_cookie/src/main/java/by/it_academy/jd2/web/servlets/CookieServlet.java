package by.it_academy.jd2.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.beans.Encoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "CookieServlet", urlPatterns = "/cook")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");

            try {
                String   paramefirstName = getParameter(req, resp, firstName, "firstName");
                String  paramlastName = getParameter(req, resp, lastName, "lastName");
                resp.setContentType("text/html");
                PrintWriter writer = resp.getWriter();
                writer.write("<p><span style='color: red;'>Hello, " + paramefirstName + " " + paramlastName + "!<p>");
            } catch (Exception e) {

                PrintWriter writer = resp.getWriter();
                writer.println("No one or two parametrs" );

            }
        }

        private String getParameter(HttpServletRequest req, HttpServletResponse resp, String value, String name) throws Exception {



            if (value != null ) {

                Cookie cookie = new Cookie(name, value);
                cookie.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
                resp.addCookie(cookie);

                return value;
            }else{

                Cookie[] cookies = req.getCookies();
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals(name)) {
                        value = cookie.getValue();

                        return value;
                    }
                }
            }
            throw new Exception();
        }
}
