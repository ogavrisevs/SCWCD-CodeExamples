package norma.packg.servInf;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServInformation extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<br> ServletName : "+ getServletName());
		pw.println("<br> ServletInfo : "+ getServletInfo());
		
		ServletConfig sc = getServletConfig();
		Enumeration eu = sc.getInitParameterNames();
		while (eu.hasMoreElements()){
			String key = (String) eu.nextElement();
			pw.println("<br> key : "+ key +"val "+  sc.getInitParameter(key));
		}
		
		pw.println("<br> ServletInfo : "+ getServletInfo());
		
	}


}
