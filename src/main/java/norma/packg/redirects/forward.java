package norma.packg.redirects;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forward extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("forward : response.jsp");
		System.out.println("add atribute : customAtrib");
		request.setAttribute("customAtrib", "myCustAtrib");		
		RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
		rd.forward(request, response);
	}
}
