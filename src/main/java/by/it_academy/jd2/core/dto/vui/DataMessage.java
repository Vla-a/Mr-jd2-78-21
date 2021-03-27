package by.it_academy.jd2.core.dto.vui;

import java.util.ArrayList;
import java.util.List;


public class DataMessage {

    private static List<Message> messageAll;


    public static List<Message> getAllMessage(){
        if(messageAll==null){
            messageAll= new ArrayList<>();
        }return messageAll;
    }

    public static void saveMessage(Message message) {
        getAllMessage().add(message);
    }

    public static List<Message> searchMessageUserLogin(String login) {
        List<Message> messagesUser = new ArrayList<>();
        for (Message message : getAllMessage()) {
            if(message.getReceiver().equals(login)){
                messagesUser.add(message);
            }
        }
        return messagesUser;}


}