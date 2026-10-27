import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    // Called once when the servlet is initialized
    public void init() throws ServletException {
        System.out.println("Servlet initialized: init()");
    }

    // Called whenever a client sends a request
    public void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("<p>service() method is executed.</p>");
        out.println("</body></html>");

        System.out.println("Request processed: service()");
    }

    // Called once before the servlet is removed
    public void destroy() {
        System.out.println("Servlet destroyed: destroy()");
    }
}
