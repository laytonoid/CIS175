<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create a new mission</title>
</head>
<body>
    <form action="CreateNewMissionServlet" method="post">
        Mission Name: <input type="text" name="missionName"><br>
        Date: <input type="date" name="missionDate"><br>
        Force User Name: <input type="text" name="forceUserName"><br>
        Select Tasks:<br>
        <select name="selectedTasks" multiple>
            <c:forEach items="${allTasks}" var="task">
                <option value="${task.id}">${task.description}</option>
            </c:forEach>
        </select><br>
        <input type="submit" value="Create Mission">
    </form>
</body>
</html>