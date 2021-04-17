package by.it_academy.jd2.core.dto.vui.dao;

import by.it_academy.jd2.core.dto.vui.User;

import java.util.Set;

public interface DataStorageInterfase {
    void saveUsers(User user);
    User searchUserLoginAndPsw(String login,String psw);
    User searchUserLogin(String login);
    Set<String> getUsersLogin();
    int deleteUser(String login);
}