package com.laba7.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FeedbackController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Показываем форму для отправки отзыва
        request.getRequestDispatcher("/partials/feedback.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем данные из формы
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Логика обработки данных (например, сохранение в базу данных или отправка по email)

        // Отправляем пользователя на страницу с подтверждением
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Спасибо за ваш отзыв, " + name + "!</h3>");
        out.println("<p>Мы обязательно с вами свяжемся по email: " + email + "</p>");
        out.println("<a href='main'>На главную</a>");
        out.println("</body></html>");
    }
}
