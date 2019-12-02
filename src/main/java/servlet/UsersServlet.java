package servlet;

import javax.servlet.Filter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class UsersServlet extends HttpServlet {
    HashMap<String,String> profiles = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Path path = Paths.get("content/like-page.html");
        ServletOutputStream servletOutputStream =resp.getOutputStream();
        Files.copy(path,servletOutputStream);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //When a Yes/No button is pressed - send a POST request to the server (there is no handler there at the moment)
        //Add POST request handler on the server and store the user's choice (yes or no) on the server (in any form)
        RedirectServlet rs = new RedirectServlet("/users");
    }
}
