package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MissionDetails;
import model.ForceUser;

@WebServlet("/CreateNewMissionServlet")
public class CreateNewMissionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CreateNewMissionServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MissionDetailsHelper mdh = new MissionDetailsHelper();
        ForceUserHelper fuh = new ForceUserHelper();

        String missionName = request.getParameter("missionName");
        String missionDate = request.getParameter("missionDate");
        LocalDate date = LocalDate.parse(missionDate);
        String forceUserName = request.getParameter("forceUserName");
        System.out.println("Force User Name: " + forceUserName);

        ForceUser forceUser = fuh.findForceUserByName(forceUserName);

        if (forceUser != null) { 
            MissionDetails newMission = new MissionDetails();
            newMission.setMissionName(missionName);
            newMission.setMissionDate(date);
            newMission.setForceUser(forceUser);

            mdh.insertNewMissionDetails(newMission);

            System.out.println("Done!");
            System.out.println(newMission.toString());
        } else {
            System.out.println("Failed to find Force User by the name: " + forceUserName);
        }

        getServletContext().getRequestDispatcher("/viewAllMissionsServlet").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}