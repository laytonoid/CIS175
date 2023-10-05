package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MissionDetails;

@WebServlet("/viewAllMissionsServlet")
public class ViewAllMissionsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MissionDetailsHelper mdh = new MissionDetailsHelper();
        List<MissionDetails> allMissions = mdh.showAllMissions();
        request.setAttribute("allMissions", allMissions);
        
        if(allMissions.isEmpty()){
            request.setAttribute("allMissions", new ArrayList<MissionDetails>());
        }
        
        getServletContext().getRequestDispatcher("/missions-by-forceuser.jsp").forward(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}