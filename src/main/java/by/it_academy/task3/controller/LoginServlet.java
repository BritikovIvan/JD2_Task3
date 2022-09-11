package by.it_academy.task3.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        if (login != null) {
            writer.println("Hello " + login);

            if (login.equals("Ivan") && password.equals("123")) {
                HttpSession session = req.getSession();
                session.setAttribute("user", login);
            }
        } else {
            writer.println("Hello user");
        }
        writer.println("</body>");
        writer.println("</html>");

    }
}
