package com.javarush.quest.shevchenko.model;

import java.util.ArrayList;

public class Question {
    private ArrayList<String> questions = new ArrayList<>();
    public Question() {
        fillQuestions();
    }

    public ArrayList<String> getList() {
        return questions;
    }

    public void fillQuestions() {
        questions.add("Ты всегда мечтал покорять бесконечные горизонты вселенной. Принять вызов судьбы?");
        questions.add("Ты принял вызов судьбы. Капитан предлагает подняться тебе на борт корабля. Твои действия");
        questions.add("Ты поднялся на борт. Тебя просят продемонстрировать силу! Капитан смотрит...");
    }
}
