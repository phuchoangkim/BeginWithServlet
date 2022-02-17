import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/person-form"})
public class PersonForm extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<form action='/BeginWithServlet/person-info' method = 'POST'>");
		printWriter.println("Name: <input type='input' name='name'/>");
		printWriter.println("Age: <input type='input' name='age'/>");
		printWriter.println("<input type='submit' name='submit' value='Submit'/>");
		printWriter.println("</form>");
		printWriter.close();
	}
}
