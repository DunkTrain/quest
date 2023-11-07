package com.javarush.quest.shevchenko.model;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AnswerTest {

    @Test
    void testGetAnswers() {
        Answer answer = new Answer();
        List<String> expectedList = List.of(
                "Принять вызов судьбы",
                "Подняться на борт корабля орков",
                "Ударить мелкого гоблина, который пытался стащить трофей капитана"
        );
        assertArrayEquals(expectedList.toArray(), answer.getList().toArray());
    }
}