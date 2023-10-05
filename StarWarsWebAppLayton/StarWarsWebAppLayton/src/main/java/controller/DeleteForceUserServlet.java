package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ForceUser;

@WebServlet("/DeleteForceUserServlet")
public class DeleteForceUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ForceUserHelper fuh = new ForceUserHelper();
        Integer tempId = Integer.parseInt(request.getParameter("id"));
        ForceUser userToDelete = fuh.searchForForceUserById(tempId);
        fuh.deleteForceUser(userToDelete);
        getServletContext().getRequestDispatcher("/viewAllForceUsersServlet").forward(request, response);
    }
}