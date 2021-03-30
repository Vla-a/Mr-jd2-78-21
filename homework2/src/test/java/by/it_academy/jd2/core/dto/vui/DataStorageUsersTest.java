package by.it_academy.jd2.core.dto.vui;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DataStorageUsersTest {

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
    }

    @Test
    void classDefinition() {
        DataStorageUsers dsu = new DataStorageUsers();
        Assert.assertTrue(dsu instanceof DataStorageUsers);
    }

    @Test
    void usersAll() {
    }

    @Test
    void saveUsers() {

        User newUser = new User();
        newUser.setName("Vlad");
        newUser.setLogin("vvv");
        newUser.setPassword("333");
        newUser.setBirthday("11.11.2011");
        DataStorageUsers.saveUsers(newUser);
        assertEquals(
                newUser.getName(),
                DataStorageUsers.searchUserLogin(newUser.getLogin()).getName()
        );
    }

    @Test
    void searchUserLoginAndPsw() {
        User userActual = DataStorageUsers.searchUserLoginAndPsw(userReceiver.getLogin(), userReceiver.getPassword());
        boolean test =( (userActual.getLogin().equals(userReceiver.getLogin()))&&(userActual.getPassword().equals(userReceiver.getPassword())));
        assertEquals(true, test);
    }

    @Test
    void searchUserLogin() {
        String actual = DataStorageUsers.searchUserLogin(userSender.getLogin()).getLogin();
        String expected = userSender.getLogin();
        assertEquals(expected, actual);
    }

    @Test
    void getUsersLogin() {
        Set<String> set = new HashSet<>();
        set.add(userSender.getLogin());
        set.add(userReceiver.getLogin());
        Set<String> actual = DataStorageUsers.getUsersLogin();
        Set<String> expected = set;
    }
}