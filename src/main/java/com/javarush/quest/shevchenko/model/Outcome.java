package com.javarush.quest.shevchenko.model;

import java.util.ArrayList;

public class Outcome {
    private ArrayList<String> outcomes = new ArrayList<>();
    public Outcome() {
        getOutcomes();
    }
    public ArrayList<String> getList() {
        return outcomes;
    }
    public void getOutcomes()    {
        outcomes.add("Ты сделал не правильный выбор. Ты послужишь ресурсом для великих дел орды!");
        outcomes.add("Ты слишком мал для орка. Орки приняли тебя за гоблина, теперь ты их слуга.");
        outcomes.add("Ты совершил ошибку, тебя убили.");
    }
}
