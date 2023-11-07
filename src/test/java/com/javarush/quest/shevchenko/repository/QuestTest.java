package com.javarush.quest.shevchenko.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.javarush.quest.shevchenko.model.Answer;
import com.javarush.quest.shevchenko.model.Option;
import com.javarush.quest.shevchenko.model.Outcome;
import com.javarush.quest.shevchenko.model.Question;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class QuestTest {

    @Test
    void incrementId() {
        Quest quest = new Quest();
        int expectedId = quest.getId() + 1;
        quest.incrementId();;
        assertEquals(expectedId, quest.getId());
    }

    @Test
    void getCurrentQuestion() {
        Quest quest = new Quest();
        Question question = new Question();
        String expectedCurrentQuestion = question.getList().get(quest.getId());
        String result = quest.getCurrentQuestion();
        assertEquals(expectedCurrentQuestion, result);
    }

    @Test
    void getCurrentAnswer() {
        Quest quest = new Quest();
        Answer answer = new Answer();
        String expectedCurrentAnswer = answer.getList().get(quest.getId());
        String result = quest.getCurrentAnswer();
        assertEquals(expectedCurrentAnswer, result);
    }

    @Test
    void getCurrentOptions() {
        Quest quest = new Quest();
        Option option = new Option();
        ArrayList<String> expectedCurrentOption = option.getList().get(quest.getId());
        ArrayList<String> result = quest.getCurrentOptions();
        assertEquals(expectedCurrentOption, result);
    }

    @Test
    void getCurrentOutcome() {
        Quest quest = new Quest();
        Outcome outcome = new Outcome();
        String expectedCurrentOutcome = outcome.getList().get(quest.getId());
        String result = quest.getCurrentOutcome();
        assertEquals(expectedCurrentOutcome, result);
    }

    @Test
    void hasNextQuestion() {
        Quest quest = new Quest();
        Question question = new Question();
        boolean expectedResult = quest.getId() < question.getList().size();
        boolean result = quest.hasNextQuestion();
        assertEquals(expectedResult, result);
    }

    @Test
    void checkAnswer() {
        Quest quest = new Quest();
        Answer answer = new Answer();
        String parameter = answer.getList().get(quest.getId());
        boolean expectedResult = answer.getList().get(quest.getId()).equals(parameter);
        boolean result = quest.checkAnswer(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void getQuestionNumber() {
        Quest quest = new Quest();
        int expectedNumber = quest.getId() + 1;
        int result = quest.getQuestionNumber();
        assertEquals(expectedNumber, result);
    }

}
