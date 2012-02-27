package norma.packg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servLeta extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Hello World!</h1>");
		pw.println("<h3>Go go go 3 </h3>");
		pw.println("</body>");
		pw.println("</html>");
		
		pw.println(request.getServletPath());
		pw.println(request.getServerName());
		pw.println(request.getRemoteAddr());
		pw.println(request.getRemoteHost());
		
		Enumeration iter = request.getAttributeNames();
		while (iter.hasMoreElements()){
			String key = (String) iter.nextElement();
			pw.println(key +" : "+request.getAttribute(key));
		}
		
		pw.println("</body>");
		pw.println("</html>");

	}
}
