package norma.packg.oneparam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

public class OneParam extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println(" doGet Call <br>");
		printParams(request, pw );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println(" doPost Call  <br>");
		printParams(request, pw );
		
	}
	
	
	private void printParams( HttpServletRequest request, PrintWriter pw){
		Enumeration iter = request.getParameterNames();
		while (iter.hasMoreElements()){
			String key = (String) iter.nextElement();
			pw.println(key +" : "+request.getParameter(key));
		}
	}
	
}
