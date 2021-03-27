package by.it_academy.jd2.web.servlets.home;

import by.it_academy.jd2.core.dto.vui.DataStorageUsers;
import by.it_academy.jd2.core.dto.vui.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SignUp", urlPatterns = "/signUp")
public class ServletSignUp extends HttpServlet {

    public  String name = "name";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "psw";
    public  String birthday = "birthday";
    public static final String USER_SENDER="userSender";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/signUp.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setLogin(req.getParameter(LOGIN));
        user.setPassword(req.getParameter(PASSWORD));
        user.setName(req.getParameter(name));
        user.setBirthday(req.getParameter(birthday));
        User userSearch = DataStorageUsers.searchUserLogin(user.getLogin());
        if(userSearch!=null){
            req.setAttribute("invalidUserLogin",true);
            getServletContext().getRequestDispatcher("/signUp.jsp").forward(req, resp);
        }
        DataStorageUsers.saveUsers(user);
        HttpSession session = req.getSession();
        session.setAttribute(USER_SENDER,user);
        String path = req.getContextPath() + "/menu";
        resp.sendRedirect(path);
    }
}
