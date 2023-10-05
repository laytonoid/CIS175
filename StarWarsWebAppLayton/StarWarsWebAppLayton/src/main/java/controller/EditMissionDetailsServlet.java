package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ForceUser;
import model.MissionDetails;

@WebServlet("/editMissionDetailsServlet")
public class EditMissionDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MissionDetailsHelper mdh = new MissionDetailsHelper();
        ForceUserHelper fuh = new ForceUserHelper();
        
        Integer tempId = Integer.parseInt(request.getParameter("id"));
        MissionDetails missionToUpdate = mdh.searchForMissionDetailsById(tempId);
        
        String newMissionName = request.getParameter("missionName");
        missionToUpdate.setMissionName(newMissionName);
        
        String forceUserName = request.getParameter("forceUserName");
        ForceUser forceUser = fuh.findForceUserByName(forceUserName);
        missionToUpdate.setForceUser(forceUser);
        

        mdh.updateMission(missionToUpdate);

        getServletContext().getRequestDispatcher("/viewAllMissionsServlet").forward(request, response);
    }
}