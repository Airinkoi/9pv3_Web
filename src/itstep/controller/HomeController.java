package itstep.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "Hello World";
        req.setAttribute("message", message);

        String page = req.getParameter("page");
        req.setAttribute("page", page);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/home.jsp");
        dispatcher.forward(req, resp);
    }
}