package com.javarush.quest.shevchenko.model;

import java.util.ArrayList;

public class Answer {
    private ArrayList<String> answers = new ArrayList<>();
    public Answer() {
        getAnswers();
    }
    public ArrayList<String> getList() {
        return answers;
    }
    public void getAnswers() {
        answers.add("Принять вызов судьбы");
        answers.add("Подняться на борт корабля орков");
        answers.add("Ударить мелкого гоблина, который пытался стащить трофей капитана");
    }
}