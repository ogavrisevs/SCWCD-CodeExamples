package norma.packg.multipleparams;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MultipleParams extends HttpServlet {
    public MultipleParams() {
        super();
        System.out.println("constructor : "+ this);
    }
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("serverlet Example2.init() : " + this);
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();		
		
		pw.println("<br> QueryString : "+ request.getQueryString());
		pw.println("<br> RemoteUser  : "+ request.getRemoteUser());
		
		HttpSession hSes = request.getSession();

		pw.println("<br> Session"+ hSes);
		Enumeration enu = hSes.getAttributeNames();		
		pw.println("<br> AttributeNames");
		while (enu.hasMoreElements()){
			Object obj = enu.nextElement();
			Object atriObj = hSes.getAttribute((String)obj);
			pw.println("<br> "+ obj +" : "+ atriObj);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		Enumeration enu = request.getHeaderNames();
		pw.println("<br> Heders ");
		while (enu.hasMoreElements()){
			String head  = (String) enu.nextElement();
			pw.println("<br>Heder : "+ head +" Val : "+ request.getHeader(head));
		}
		
		 Enumeration enu2 = request.getParameterNames();
		 while(enu2.hasMoreElements()){
			 Object obj  = enu2.nextElement();
			 pw.println("<br> Parameters  : "+ obj);
			 String [] params  = request.getParameterValues((String)obj);
			 for (String param : params)
				 pw.println("<br>     Param : "+ param);
		 }
	}
}
