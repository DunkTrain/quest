package com.javarush.quest.shevchenko.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Option {

    private ArrayList<ArrayList<String>> options = new ArrayList<>();

    public Option() {
        getOptions();
    }

    public ArrayList<ArrayList<String>> getList() {
        return options;
    }

    public void getOptions()     {
        options.add(new ArrayList<>(Arrays.asList("Принять вызов судьбы", "Молиться императору", "Отклонить вызов судьбы")));
        options.add(new ArrayList<>(Arrays.asList("Подняться на борт корабля орков", "Попытаться претвориться большим орком")));
        options.add(new ArrayList<>(Arrays.asList("Напасть на капитана", "Ударить мелкого гоблина, который пытался стащить трофей капитана", "Передумать. Сказать, что ты ошибся кораблем.")));
    }
}