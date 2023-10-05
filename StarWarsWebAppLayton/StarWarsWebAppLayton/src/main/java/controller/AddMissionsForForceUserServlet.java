package controller;
import java.io.IOException;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addMissionsForForceUserServlet")
public class AddMissionsForForceUserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MissionTaskHelper mth = new MissionTaskHelper();
        request.setAttribute("allTasks", mth.showAllTasks());
        
        if(mth.showAllTasks().isEmpty()){
            request.setAttribute("allTasks", Collections.emptyList());
        }
        
        getServletContext().getRequestDispatcher("/new-mission.jsp").forward(request, response);
    }
}
