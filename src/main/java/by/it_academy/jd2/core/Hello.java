package by.it_academy.jd2.core;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args){

        Usersss us = new Usersss();
        Scanner scan = new Scanner(System.in);

        System.out.println("Имя для выхода exit");
        System.out.println("Введи имя");

        String s = null;

        while (!(s = scan.next()).equalsIgnoreCase("exit")) {
            us.add(s);
        }
        System.out.println(us.getAll());
    }
}
