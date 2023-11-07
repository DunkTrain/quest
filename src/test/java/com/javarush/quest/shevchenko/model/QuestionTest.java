package com.javarush.quest.shevchenko.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuestionTest {

    @Test
    void testGetQuestions() {
        Question question = new Question();
        List<String> expectedList = Arrays.asList(
                "Ты всегда мечтал покорять бесконечные горизонты вселенной. Принять вызов судьбы?",
                "Ты принял вызов судьбы. Капитан предлагает подняться тебе на борт корабля. Твои действия",
                "Ты поднялся на борт. Тебя просят продемонстрировать силу! Капитан смотрит..."
        );
        assertArrayEquals(expectedList.toArray(), question.getList().toArray());
    }
}
