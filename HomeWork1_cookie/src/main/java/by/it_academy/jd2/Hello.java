package by.it_academy.jd2;

import by.it_academy.jd2.utils.ApacheCommonsLang3;

/**
 * Класс Hello.

 * @version 1
 */
public class Hello {


    /**
     * @param args fhjk
     */
    public static void main(String[] args){
        for (String arg : args){
            if(ApacheCommonsLang3.isAllLowerCase(arg)){
                System.out.println(arg);
            }
        }
    }
}
