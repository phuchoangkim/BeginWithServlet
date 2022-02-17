import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/error-handler"})
public class ErrorHandler extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Handle error");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		String output = "<h1>" + "Please check your address!" + "</h1>";
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(output);
		printWriter.close();
		throw new IOException();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
