package by.it_academy.jd2.core.dto.vui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getName() {
        User user = new User();
        user.setName("Vladimir");
        assertEquals("Vladimir", user.getName());
    }

    @Test
    void setName() {
        User user = new User();
        user.setName("Vladimir");
        assertEquals("Vladimir", user.getName());

    }

    @Test
    void getLogin() {
        User user = new User();
        user.setLogin("Vov");
        assertEquals("Vov", user.getLogin());
    }

    @Test
    void setLogin() {
        User user = new User();
        user.setLogin("Vov");
        assertEquals("Vov", user.getLogin());
    }

    @Test
    void getPassword() {
        User user = new User();
        user.setPassword("111");
        assertEquals("111", user.getPassword());
    }

    @Test
    void setPassword() {
        User user = new User();
        user.setPassword("111");
        assertEquals("111", user.getPassword());
    }

    @Test
    void getBirthday() {
        User user = new User();
        user.setBirthday("15.08.2000 10:01:00");
        assertEquals("15.08.2000 10:01:00", user.getBirthday());
    }

    @Test
    void setBirthday() {
        User user = new User();
        user.setBirthday("15.08.2000 10:01:00");
        assertEquals("15.08.2000 10:01:00", user.getBirthday());
    }
    @Test
    void testToString() {
        User user = new User();
        user.setName("Vladimir");
        user.setLogin("Vov");
        user.setPassword("111");
        user.setBirthday("25.03.2021 11:06:45");
        assertEquals(" Vov(имя Vladimir)", user.toString());

    }
}