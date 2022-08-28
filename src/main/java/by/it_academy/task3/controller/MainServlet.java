package by.it_academy.task3.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("user");

        if (user != null) {
            resp.sendRedirect("/Task3/task");
        } else {
            PrintWriter writer = resp.getWriter();

            writer.println("<html>");
            writer.println("<body>");
            writer.println("Access denied");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
