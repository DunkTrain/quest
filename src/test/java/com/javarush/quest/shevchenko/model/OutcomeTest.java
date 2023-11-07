package com.javarush.quest.shevchenko.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OutcomeTest {

    @Test
    void testGetOutcomes() {
        Outcome outcome = new Outcome();
        List<String> expectedList = Arrays.asList(
                "Ты сделал не правильный выбор. Ты послужишь ресурсом для великих дел орды!",
                "Ты слишком мал для орка. Орки приняли тебя за гоблина, теперь ты их слуга.",
                "Ты совершил ошибку, тебя убили."
        );
        assertArrayEquals(expectedList.toArray(), outcome.getList().toArray());
    }
}
