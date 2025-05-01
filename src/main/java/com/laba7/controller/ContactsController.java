package com.laba7.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ContactsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Отправляем запрос на отображение страницы "Контакты"
        RequestDispatcher dispatcher = request.getRequestDispatcher("/partials/contacts.jsp");
        dispatcher.forward(request, response);
    }
}
