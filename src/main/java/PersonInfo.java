import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/person-info"})
public class PersonInfo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("name");
		 String age = req.getParameter("age");
		 String output = "<h1>" + "Hello " + name + ", " + age + "</h1>";
		 resp.setContentType("text/html");
		 PrintWriter printWriter = resp.getWriter();
		 printWriter.println(output);
		 printWriter.close();
	}
}
