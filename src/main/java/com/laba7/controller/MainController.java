package com.laba7.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class MainController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Отправляем запрос на отображение главной страницы
        RequestDispatcher dispatcher = request.getRequestDispatcher("/partials/index.jsp");
        dispatcher.forward(request, response);
    }
}
