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
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;



@WebServlet(name = "CookieServlet1", urlPatterns = "/cookie")
public class CookieServlet1 extends HttpServlet {

    private static final String FIRST_NAME_PARAM_NAME = "firstName";
    private static final String LAST_NAME_PARAM_NAME = "lastName";
   private static final String DATE_BORN = "born";
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String firstNameVal = getValueFromAnywhere(req, FIRST_NAME_PARAM_NAME);
        saveCookies(resp, FIRST_NAME_PARAM_NAME, firstNameVal);

        String lastNameVal = getValueFromAnywhere(req, LAST_NAME_PARAM_NAME);
        saveCookies(resp, LAST_NAME_PARAM_NAME, lastNameVal);

        String born = getValueFromAnywhere(req, DATE_BORN);
        saveCookies(resp, DATE_BORN, lastNameVal);

        String login = getValueFromAnywhere(req, LOGIN);
        saveCookies(resp, LOGIN, lastNameVal);

        String password = getValueFromAnywhere(req, PASSWORD);
        saveCookies(resp, PASSWORD, lastNameVal);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<p><span style='color: bleak;'>Hello, " + firstNameVal +" "+ lastNameVal + " " +born + " "+ login + " " +password +"!</span></p>");
        resp.sendRedirect("http://localhost:8080/Mr-JD2-78-21-0.0.0-SNAPSHOT/cook");

    }

    public static String getValueFromAnywhere(HttpServletRequest req,String key){

        String val=req.getParameter(key);
        if(val==null){
            Cookie[]cookies=req.getCookies();

            if(cookies!=null){
                val=Arrays.stream(cookies)
                        .filter(c->key.equalsIgnoreCase(c.getName()))
                        .map(Cookie::getValue)
                        .findFirst()
                        .orElse(null);
            }
        }
        if(val==null){
            throw new IllegalArgumentException("не передано");
        }
        return val;
    }
    public static void saveCookies(HttpServletResponse resp,String key,String val){

        Cookie myCookie=new Cookie(key,URLEncoder.encode(val,StandardCharsets.UTF_8));

        myCookie.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
        resp.addCookie(myCookie);

    }

}
