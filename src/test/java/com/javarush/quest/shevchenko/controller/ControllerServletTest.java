package com.javarush.quest.shevchenko.controller;

import com.javarush.quest.shevchenko.repository.Quest;
import com.javarush.quest.shevchenko.repository.Repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.servlet.*;
import java.io.IOException;
import static org.mockito.Mockito.*;

class ControllerServletTest {

    @Test
    void doPost() throws ServletException, IOException {
        Quest quest = new Quest();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        when(request.getParameter("startRadioOptions")).thenReturn(quest.getCurrentAnswer());
        Repository repository = mock(Repository.class);
        when(repository.checkAnswer(quest.getCurrentAnswer())).thenReturn(true);
        when(repository.getCurrentOutcome()).thenReturn(quest.getCurrentOutcome());
        when(repository.hasNextQuestion()).thenReturn(true);
        quest.incrementId();
        when(repository.getCurrentQuestion()).thenReturn(quest.getCurrentQuestion());
        when(repository.getCurrentOptions()).thenReturn(quest.getCurrentOptions());
        when(repository.getQuestionNumber()).thenReturn(quest.getQuestionNumber());
        when(session.getAttribute("repository")).thenReturn(repository);
        ControllerServlet controllerServlet = new ControllerServlet();
        controllerServlet.doPost(request,response);
        verify(request, times(1)).getParameter("startRadioOptions");
        verify(session, times(1)).getAttribute("repository");
        verify(repository, times(1)).checkAnswer("Принять вызов судьбы");
        verify(repository, times(1)).getCurrentOutcome();
        verify(repository, times(1)).incrementId();
        verify(repository, times(1)).hasNextQuestion();
        verify(repository, times(1)).getCurrentQuestion();
        verify(repository, times(1)).getCurrentOptions();
        verify(repository, times(1)).getQuestionNumber();
        verify(response, times(1)).sendRedirect("/quest.jsp");
    }


}
