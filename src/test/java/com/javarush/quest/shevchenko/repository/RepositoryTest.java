package com.javarush.quest.shevchenko.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    private Quest quest;
    private Repository repository;

    @BeforeEach
    void setUp() {
        quest = new Quest();
        repository = new Repository();
    }

    @Test
    void getCurrentQuestion() {
        assertEquals(quest.getCurrentQuestion(), repository.getCurrentQuestion());
    }

    @Test
    void getCurrentOptions() {
        assertEquals(quest.getCurrentOptions(), repository.getCurrentOptions());
    }

    @Test
    void getCurrentAnswer() {
        assertEquals(quest.getCurrentAnswer(), repository.getCurrentAnswer());
    }

    @Test
    void getCurrentOutcome() {
        assertEquals(quest.getCurrentOutcome(), repository.getCurrentOutcome());
    }

    @Test
    void checkAnswer() {
        String correctAnswer = quest.getCurrentAnswer();
        String incorrectAnswer = "Uncorrected";
        assertTrue(repository.checkAnswer(correctAnswer));
        assertFalse(repository.checkAnswer(incorrectAnswer));
    }

    @Test
    void getId() {
        assertEquals(quest.getId(), repository.getId());
    }

    @Test
    void incrementId() {
        quest.incrementId();
        repository.incrementId();
        assertEquals(quest.getId(), repository.getId());
    }

    @Test
    void getQuestionNumber() {
        assertEquals(quest.getQuestionNumber(), repository.getQuestionNumber());
    }

    @Test
    void hasNextQuestion() {
        assertEquals(quest.hasNextQuestion(), repository.hasNextQuestion());
    }
}