package by.it_academy.jd2.core.dto.vui;

import java.util.HashSet;
import java.util.Set;

public class AllUsers {
    private static Set<User> AllUsers;

    private AllUsers() {
    }
    public static Set<User> getAllUsers(){
        if(AllUsers==null){
            AllUsers= new HashSet<>();
        }return AllUsers;
    }
}
