package com.laba7.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AboutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Отправляем запрос на отображение страницы "О компании"
        RequestDispatcher dispatcher = request.getRequestDispatcher("/partials/about.jsp");
        dispatcher.forward(request, response);
    }
}
