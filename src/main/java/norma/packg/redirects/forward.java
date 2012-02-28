package norma.packg.redirects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class forward extends HttpServlet {
    private static final Logger logger = Logger.getLogger(forward.class.getName());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("Forward : response.jsp");
        logger.info("add atribute : customAtrib");
        request.setAttribute("customAtrib", "myCustAtrib");
        RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
        rd.forward(request, response);
    }
}
