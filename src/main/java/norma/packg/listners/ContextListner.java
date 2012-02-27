package norma.packg.listners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListner implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		ServletContext sc =arg0.getServletContext();
		sc.setAttribute("atribute_from", "ContextListner");
	}

	public void contextInitialized(ServletContextEvent arg0) {


	}

}
