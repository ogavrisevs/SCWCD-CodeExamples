package norma.packg.refresh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class ServletRefresh extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String datStr = new Date().toString();
        pw.append(datStr);
        if (request.getParameter("ref") != null)
            response.addHeader("Refresh", "5");

        if (request.getParameter("refred") != null)
            response.addHeader("Refresh", "5;http://pods.lv");

    }
}
