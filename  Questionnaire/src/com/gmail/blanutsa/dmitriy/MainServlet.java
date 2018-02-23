package com.gmail.blanutsa.dmitriy;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/send")
public class MainServlet extends HttpServlet {

    private static String template = "<html>\n" +
            "<head>\n" +
            "    <title>$Title$</title>\n" +
            "    <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"container\">\n" +
            "    <table class=\"table\">\n" +
            "        <tr><td>Имя: </td><td>%s</td></tr>\n" +
            "        <tr><td>Фамилия: </td><td>%s</td></tr>\n" +
            "        <tr><td>Возвраст: </td><td>%d</td></tr>\n" +
            "    </table>\n" +
            "</div>\n" +
            "<div class=\"container\">\n" +
            "    <table class=\"table table-bordered\">\n" +
            "        <tr><td>C/C++</td><td>%d</td></tr>\n" +
            "        <tr><td>Pascal</td><td>%d</td></tr>\n" +
            "        <tr><td>Java</td><td>%d</td></tr>\n" +
            "        <tr><td>Python</td><td>%d</td></tr>\n" +
            "        <tr><td>C#</td><td>%d</td>/tr>\n" +
            "        <tr><td>JavaScript</td><td>%d</td></tr>\n" +
            "        <tr><td>PHP</td><td>%d</td></tr>\n" +
            "        <tr><td>Другое</td><td>%d</td></tr>\n" +
            "    </table>\n" +
            "</div>\n" +
            "<script src=\"js/bootstrap.min.js\"></script>\n" +
            "</body>\n" +
            "</html>";

    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("C/C++", 0);
        map.put("Pascal", 0);
        map.put("Java", 0);
        map.put("Python", 0);
        map.put("C#", 0);
        map.put("JavaScript", 0);
        map.put("PHP", 0);
        map.put("different", 0);
    }

    @Override
    protected void doPost(HttpServletRequest rec, HttpServletResponse res) throws IOException {

        String firstname = rec.getParameter("firstname");
        String lastname = rec.getParameter("lastname");
        int age;
        try {
            age = Integer.parseInt(rec.getParameter("age"));
        }catch (NumberFormatException e){
            age = 0;
        }

        res.setContentType("text/html; charset=utf-8");

        String len = rec.getParameter("len");
        map.put(len, map.get(len)+1);

        res.getWriter().printf(template, firstname, lastname, age,
                map.get("C/C++"),
                map.get("Pascal"),
                map.get("Java"),
                map.get("Python"),
                map.get("C#"),
                map.get("JavaScript"),
                map.get("PHP"),
                map.get("different"));
    }

}
