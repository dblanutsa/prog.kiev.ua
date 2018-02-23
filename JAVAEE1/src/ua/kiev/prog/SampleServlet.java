package ua.kiev.prog;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/dd")
public class SampleServlet extends HttpServlet {

    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html"); // Content-Type: text/html

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>Prog.kiev.ua Test</title></head>");
        pw.println("<body>Hello, Java Junior :)</body></html>");
	}

}
