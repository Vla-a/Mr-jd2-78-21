package by.it_academy.jd2.core.dto.vui.dao;

import by.it_academy.jd2.core.dto.vui.Message;
import by.it_academy.jd2.core.dto.vui.User;

import java.util.List;

public interface DataMassageInterfase {


    void saveMessage(Message message);

    List<Message> searchMessageUserLogin(String login);

    String printMessasgeUserLogin(User userSender);

    String printMessasgeUserLoginC(User userSender);

    int deleteMessageSender(String login);

    int deleteMessageReceiver(String login);
}