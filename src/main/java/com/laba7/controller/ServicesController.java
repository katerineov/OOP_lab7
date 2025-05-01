package com.laba7.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ServicesController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Отправляем запрос на отображение страницы "Услуги"
        RequestDispatcher dispatcher = request.getRequestDispatcher("/partials/services.jsp");
        dispatcher.forward(request, response);
    }
}
