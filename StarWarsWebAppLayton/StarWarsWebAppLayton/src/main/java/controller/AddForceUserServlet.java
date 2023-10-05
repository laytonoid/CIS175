package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ForceUser;

@WebServlet("/addForceUserServlet")
public class AddForceUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String lightsaberColor = request.getParameter("lightsaberColor");
		String affiliation = request.getParameter("affiliation");

		ForceUser forceUser = new ForceUser(name, lightsaberColor, affiliation);
		ForceUserHelper dao = new ForceUserHelper();
		dao.insertForceUser(forceUser);

		getServletContext().getRequestDispatcher("/viewAllForceUsersServlet").forward(request, response);
	}
}