package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import model.MissionDetails;
import model.MissionTask;

@WebServlet("/addTasksForMissionServlet")
public class AddTasksForMissionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MissionDetailsHelper mdh = new MissionDetailsHelper();
        MissionTaskHelper mth = new MissionTaskHelper();
        
        String missionIdString = request.getParameter("missionId");
        if(missionIdString == null || missionIdString.isEmpty()){
            return;
        }
        Integer missionId = Integer.parseInt(request.getParameter("missionId"));
        MissionDetails missionToUpdate = mdh.searchForMissionDetailsById(missionId);
        
        String[] selectedTasks = request.getParameterValues("allTasksToAdd");

        List<MissionTask> selectedTasksInMission = new ArrayList<MissionTask>();
        for (int i = 0; i < selectedTasks.length; i++) {
            Integer taskId = Integer.parseInt(selectedTasks[i]);
            MissionTask task = mth.searchForMissionTaskById(taskId);
            selectedTasksInMission.add(task);
        }
        
        missionToUpdate.setListOfTasks(selectedTasksInMission);
        mdh.updateMissionDetails(missionToUpdate);

        getServletContext().getRequestDispatcher("/viewAllMissionsServlet").forward(request, response);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}