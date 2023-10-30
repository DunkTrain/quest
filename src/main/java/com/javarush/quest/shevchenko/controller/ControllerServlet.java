package com.javarush.quest.shevchenko.controller;

import com.javarush.quest.shevchenko.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ControllerServlet", value = "/controller")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String radio = request.getParameter("inlineRadioOptions");
        if (radio == null) request.getRequestDispatcher("/quest.jsp").forward(request, response);
        else {
            Repository repository = (Repository) session.getAttribute("repository");
            boolean isRightAnswer = repository.checkAnswer(radio);
            String outcome = repository.getCurrentOutcome();
            repository.incrementId();
            if (isRightAnswer && repository.hasNextQuestion()) {
                session.setAttribute("currentQuestion", repository.getCurrentQuestion());
                session.setAttribute("currentOptions", repository.getCurrentOptions());
                session.setAttribute("gameId", repository.getQuestionNumber());
                response.sendRedirect("/quest.jsp");
            }
            else {
                String s = isRightAnswer ? "Ты показал, что ты силен! Вперед, устраивать большую драку за Горка и Морка!" : outcome;
                session.setAttribute("outcome", s);
                session.setAttribute("result", isRightAnswer);
                response.sendRedirect("/restart.jsp");
            }
        }
    }
}