package by.it_academy.task3.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class DisplayImageServlet extends HttpServlet {
    public final InputStream imageStream = this.getClass().getClassLoader().getResourceAsStream("images/linus-1024x640.jpg");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("image/jpg");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(imageStream);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(resp.getOutputStream())) {

            int ch = 0;
            while ((ch=bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(ch);
            }
        }
    }
}
