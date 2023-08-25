package kr.co.joneconsulting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/hi-servlet")
public class HiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<H2>Hi, there</h2>");
//        선생님과 새로이 작성
        LocalDate _date = LocalDate.now();
        LocalDateTime _time = LocalDateTime.now();
        String today = _date.toString();

        out.println(today);
        out.println(_time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        out.close();
    }
}
