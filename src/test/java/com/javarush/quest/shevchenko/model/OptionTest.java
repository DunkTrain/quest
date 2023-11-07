package com.javarush.quest.shevchenko.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OptionTest {

    @Test
    void testGetOptions() {
        Option option = new Option();
        List<List<String>> expectedList = Arrays.asList(
                Arrays.asList("Принять вызов судьбы", "Молиться императору", "Отклонить вызов судьбы"),
                Arrays.asList("Подняться на борт корабля орков", "Попытаться претвориться большим орком"),
                Arrays.asList("Напасть на капитана", "Ударить мелкого гоблина, который пытался стащить трофей капитана", "Передумать. Сказать, что ты ошибся кораблем.")
        );
        assertArrayEquals(expectedList.toArray(), option.getList().toArray());
    }
}
