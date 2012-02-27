package norma.packg.redirects;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class redirect
 */
public class redirect extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "https://confluence.ctco.lv";
		System.out.println("redirecting to : "+ url);
		response.sendRedirect(url);
	}
}
