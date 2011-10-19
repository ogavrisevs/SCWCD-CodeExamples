package norma.packg.retPicture;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReturnPicture extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream sos = response.getOutputStream();
		
		ServletContext sc = getServletContext();
		InputStream fs = sc.getResourceAsStream("StupidPic.jpg");
		byte [] cbuf = new byte[100];
		
		while (fs.read(cbuf) > 0)
			sos.write(cbuf);
		
		sos.flush();
		sos.close();
		response.setContentType("image/jpeg");		
	}

}
