package by.it_academy.task3.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisplayImage extends HttpServlet {
    public final String imagePath = "D:\\Education\\IT-Academy\\Task3\\src\\main\\webapp\\html\\linus-1024x640.jpg";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("image/jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(imagePath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(resp.getOutputStream());
        int ch = 0;
        while ((ch=bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(ch);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();

    }
}
