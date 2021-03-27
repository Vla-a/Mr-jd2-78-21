package by.it_academy.jd2.core.dto.vui;

import java.util.HashSet;
import java.util.Set;

public class DataStorageUsers {

    private static Set<User> users;


    public static Set<User> usersAll(){
        if(users==null){
           users= new HashSet<>();
        }return users;
    }

    public static void saveUsers(User user){

        usersAll().add(user);
    }

    public static User searchUserLoginAndPsw(String login,String psw){
        for (User allUser : usersAll()) {
            if(allUser.getLogin().equals(login)&&(allUser.getPassword().equals(psw))){

                    return allUser;

            }

        } return null;
    }
    public static User searchUserLogin(String login){
        for (User allUser : usersAll()) {
            if(allUser.getLogin().equals(login)){
                return allUser;
            }
        } return null;
    }
    public static Set<String> getUsersLogin(){
        HashSet<String> usersLogin = new HashSet<>();
        for (User user : usersAll()) {
            usersLogin.add(user.getLogin());

        }
        return usersLogin;
    }

}
