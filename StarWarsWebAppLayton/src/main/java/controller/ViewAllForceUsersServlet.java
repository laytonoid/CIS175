package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewAllForceUsersServlet")
public class ViewAllForceUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewAllForceUsersServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ForceUserHelper dao = new ForceUserHelper();
		
		request.setAttribute("allForceUsers", dao.showAllForceUsers());
		
		String path = "/force-users-list.jsp";
		
		if(dao.showAllForceUsers().isEmpty()){
			path = "/index.html"; 
		}

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}