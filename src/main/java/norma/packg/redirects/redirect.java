package norma.packg.redirects;

import norma.packg.ServletHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Servlet implementation class Redirect
 */
public class redirect extends HttpServlet {
    private static final Logger logger = Logger.getLogger(redirect.class.getName());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        new ServletHelper(request, response).printInfo();
        String url = "https://confluence.ctco.lv";
        logger.info("redirecting to : " + url);
        response.sendRedirect(url);
    }
}
