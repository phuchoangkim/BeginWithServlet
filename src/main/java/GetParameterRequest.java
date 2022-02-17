import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/get-params"})
public class GetParameterRequest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get parameter from request...");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		resp.setContentType("text/html");
		String output = "<h1>" + name + ", " + age + "</h1>";
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(output);
		printWriter.close();
	}
}
