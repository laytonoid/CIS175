<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Star Wars Missions</title>
    <style>
        /* Optionally, you can add a style for the mission name if you want to adjust its appearance further */
        .mission-name {
            font-size: 16px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>Missions List</h1>
<form method="post" action="missionnavigationServlet">
    <table>
        <c:forEach items="${requestScope.allMissions}" var="currentMission">
            <tr>
                <td><input type="radio" name="id" value="${currentMission.id}"></td>
                <td><span class="mission-name">${currentMission.missionName}</span></td>
            </tr>
            <tr><td colspan="3">Mission Date: ${currentMission.missionDate}</td></tr>
            <tr><td colspan="3">Force User: ${currentMission.forceUser.name}</td></tr>
            
            <c:forEach var="task" items="${currentMission.missionTasks}">
                <tr>
                    <td></td>
                    <td colspan="3">${task.description}</td>
                </tr>
            </c:forEach>
        </c:forEach>
    </table>
    <input type="submit" value="edit" name="doThisToMission">
    <input type="submit" value="delete" name="doThisToMission">
    <input type="submit" value="add" name="doThisToMission">
</form>
<br>
<a href="index.html">Return Home</a>
</body>
</html>