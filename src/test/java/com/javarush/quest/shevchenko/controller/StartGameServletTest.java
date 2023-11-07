package com.javarush.quest.shevchenko.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.mockito.Mockito.*;

class StartGameServletTest {

    @Test
    void doPost() throws IOException, ServletException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        when(request.getRequestDispatcher("/quest.jsp")).thenReturn(dispatcher);
        StartGameServlet startGameServlet = new StartGameServlet();
        startGameServlet.doPost(request, response);
        verify(session, times(1)).getAttribute("name");
        verify(session, times(1)).getAttribute("counter");
        verify(dispatcher, times(1)).forward(request, response);
    }
}