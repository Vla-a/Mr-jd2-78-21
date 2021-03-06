package by.it_academy.jd2.web.servlets.home;

import by.it_academy.jd2.core.dto.vui.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Set;

@WebServlet(name = "Message", urlPatterns = "/message")
public class ServletMessage extends HttpServlet {

    public static final String MESSAGE="message";
    public static final String USER_RECEIVER="userReceiver";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<String> set = DataStorageUsers.getUsersLogin();
        req.setAttribute("setUsers",set);             //список логинов всех пользователей
        getServletContext().getRequestDispatcher("/message.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User userSender=(User) session.getAttribute(SignUp.USER_SENDER);

        String userReceiverLogin = req.getParameter(USER_RECEIVER);
        User userReceiver = DataStorageUsers.searchUserLogin(userReceiverLogin );
        String text = req.getParameter(MESSAGE);
        Message message = new Message(userSender, userReceiver, text);
        DataMessage.saveMessage(message);
        Set<String> set = DataStorageUsers.getUsersLogin();   //список логинов всех пользователей
        req.setAttribute("setUsers",set);
        session.setAttribute("send",true);      //aгумент отвечающий за дополнительный коментарий "Cобщение отправлено"
        getServletContext().getRequestDispatcher("/message.jsp").forward(req, resp);
    }
}
