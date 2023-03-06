package com.example.primer_proyecto_samuel;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
        // String nombre=request.getParameter("firstName");

        System.out.println("Hola");
        response.sendRedirect("index2.jsp");
    }
}