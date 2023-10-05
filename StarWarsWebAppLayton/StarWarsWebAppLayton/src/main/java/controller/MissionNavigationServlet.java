package controller;

import model.MissionDetails;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/missionnavigationServlet")
public class MissionNavigationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MissionDetailsHelper mdh = new MissionDetailsHelper();
        String act = request.getParameter("doThisToMission");

        if (act == null) {
            getServletContext().getRequestDispatcher("/viewAllMissionsServlet").forward(request, response);
        } else if (act.equals("delete")) {
            try {
                Integer tempId = Integer.parseInt(request.getParameter("id"));
                MissionDetails missionToDelete = mdh.searchForMissionDetailsById(tempId);
                mdh.deleteMission(missionToDelete);
            } catch (NumberFormatException e) {
                System.out.println("No mission selected");
            } finally {
                getServletContext().getRequestDispatcher("/viewAllMissionsServlet").forward(request, response);
            }
        } else if (act.equals("edit")) {
            try {
                Integer tempId = Integer.parseInt(request.getParameter("id"));
                MissionDetails missionToEdit = mdh.searchForMissionDetailsById(tempId);
                request.setAttribute("missionToEdit", missionToEdit);
                getServletContext().getRequestDispatcher("/edit-mission.jsp").forward(request, response);
            } catch (NumberFormatException e) {
                System.out.println("No mission selected");
            } finally {
                getServletContext().getRequestDispatcher("/viewAllMissionsServlet").forward(request, response);
            }
        } else if (act.equals("add")) {
            getServletContext().getRequestDispatcher("/new-mission.jsp").forward(request, response);
        }
        
    }
}