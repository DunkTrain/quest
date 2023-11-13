package com.javarush.quest.shevchenko.repository;

import java.util.ArrayList;

public class Repository {
    private Quest quest = new Quest();
    public String getCurrentQuestion() {
        return quest.getCurrentQuestion();
    }
    public ArrayList<String> getCurrentOptions() {
        return quest.getCurrentOptions();
    }
    public String getCurrentAnswer() {
        return quest.getCurrentAnswer();
    }
    public String getCurrentOutcome() { return quest.getCurrentOutcome(); }
    public boolean checkAnswer(String answer) {
        return quest.checkAnswer(answer);
    }
    public int getId() {
        return quest.getId();
    }
    public void incrementId() { quest.incrementId();}
    public int getQuestionNumber() {
        return quest.getQuestionNumber();
    }
    public boolean hasNextQuestion() {
        return quest.hasNextQuestion();
    }
}