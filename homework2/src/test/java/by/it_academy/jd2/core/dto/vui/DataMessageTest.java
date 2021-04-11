package by.it_academy.jd2.core.dto.vui;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DataMessageTest {
    private User userSender;
    private User userReceiver;
    private Message message;

    @BeforeAll
    private void createUsers() {
        userSender = new User();
        userSender.setName("Vladimir");
        userSender.setLogin("Vov");
        userSender.setPassword("111");
        userSender.setBirthday("11.11.2011");
        DataStorageUsers.saveUsers(userSender);

        userReceiver = new User();
        userReceiver.setName("Masha");
        userReceiver.setLogin("Marusa");
        userReceiver.setPassword("222");
        userReceiver.setBirthday("11.01.2000");
        DataStorageUsers.saveUsers(userReceiver);

        message = new Message(userSender, userReceiver, "text message");
        DataMessage.saveMessage(message);

    }

    @Test
    void classDefinition() {
        DataMessage dataMessage = new DataMessage();
        assertTrue(dataMessage instanceof DataMessage);
    }

    @Test
    void getAllMessage() {
    }

    @Test
    void saveMessage() {
        Message testMessage = new Message(userReceiver,userSender,"textTest");
        DataMessage.saveMessage(testMessage);
        DataMessage.getAllMessage().contains(testMessage);
        assertEquals(true, DataMessage.getAllMessage().contains(testMessage));
    }

    @Test
    void searchMessageUserLogin() {
        List<Message> actual = DataMessage.searchMessageUserLogin(userReceiver.getLogin());
        List<Message> list = new ArrayList<>();
        list.add(message);
        List<Message> expected = list;
        assertEquals(expected, actual);
    }
}