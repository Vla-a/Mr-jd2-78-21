package by.it_academy.jd2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ApacheCommonsLang3Test {

    private final ApacheCommonsLang3 checker = new ApacheCommonsLang3();
    @ParameterizedTest(name = "{index} - Проверяемый тест={0}")
    @DisplayName("Проверка текста на присутствие только маленьких символов")
    @MethodSource("nameProvider")
    public void isAllLowerCaseTest(String text, boolean result){
        Assertions.assertEquals(result, checker.isAllLowerCase(text));
    }

    @Test
    public static Stream<Arguments> nameProvider(){
        return Stream.of(
                Arguments.arguments("Ivan", false),
                Arguments.arguments("Anton", false),
                Arguments.arguments("AllPeople", false),
                Arguments.arguments("irina", true)
        );
    }
}