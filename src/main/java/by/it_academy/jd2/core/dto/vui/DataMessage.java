package by.it_academy.jd2.core.dto.vui;

import java.util.ArrayList;
import java.util.List;


public class DataMessage {


    public static void saveMessage(Message message) {
        AllMessage.getAllMessage().add(message);
    }

    public static List<Message> searchMessageUserLogin(String login) {
        List<Message> messagesUser = new ArrayList<>();
        for (Message message : AllMessage.getAllMessage()) {
            if(message.getReceiver().equals(login)){
                messagesUser.add(message);
            }
        }
        return messagesUser;}


}