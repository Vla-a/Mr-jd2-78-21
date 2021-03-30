package by.it_academy.jd2.core.dto.vui;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    private User userSender = new User();

    {
        userSender.setName("Vladimir");
        userSender.setLogin("Vov");
        userSender.setPassword("111");
        userSender.setBirthday("21.01.2001 11:23:11");
    }

    private User userReceiver = new User();

    {
        userReceiver.setName("Masha");
        userReceiver.setLogin("Marusia");
        userReceiver.setPassword("222");
        userReceiver.setBirthday("11.02.2002 11:11:11");
    }
    private Message messag = new Message(userSender, userReceiver, "text message");
    @Test
    void getSender() {
        Assert.assertEquals("Vladimir",messag.getSender());
    }

    @Test
    void getReceiver() {
        Assert.assertEquals("Vladimir",messag.getReceiver());
    }

    @Test
    void getDate() {
        Message message = new Message(userSender,userReceiver,"text");
        SimpleDateFormat dateTime = new SimpleDateFormat(message.getMessage());
        String date = dateTime.format(new Date());
        Assert.assertEquals(date, message.getDate());
    }

    @Test
    void getMessage() {

        Assert.assertEquals("text message", messag.getMessage());
    }

    @Test
    void testToString() {
        Message message = new Message(userSender,userReceiver,"text");
        SimpleDateFormat dateTime = new SimpleDateFormat("12.03.2021");
        String date = dateTime.format(new Date());
        Assert.assertEquals(message.getDate() , message.toString());

    }
}