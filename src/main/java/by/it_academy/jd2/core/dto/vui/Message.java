package by.it_academy.jd2.core.dto.vui;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    public  String dateForm = "dd.MM.yyyy hh:mm:ss";

    private User sender;
    private User receiver;
    private String date;
    private String message;
    public  String dateFormat = "dd.MM.yyyy hh:mm:ss";

    public Message(User sender, User receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        SimpleDateFormat dateTime = new SimpleDateFormat(dateFormat);
        this.date = dateTime.format(new Date());
    }

    public String getSender() {
        return sender.getLogin();
    }

    public String getReceiver() {
        return receiver.getLogin();
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {

        return "user: " + sender.getName() +";  letter: " + message + "; date: " + date+  "\n";
    }
}
