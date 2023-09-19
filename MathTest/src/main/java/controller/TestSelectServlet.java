package controller;
import model.TestForMath;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestSelectServlet
 */
@WebServlet("/SelectTestServlet")
public class TestSelectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String testType = request.getParameter("testType");
        
        if ("addsubtract".equals(testType)) {
            response.sendRedirect("addsubtract.jsp");
        } else if ("multiplydivide".equals(testType)) {
            response.sendRedirect("multiplydivide.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}