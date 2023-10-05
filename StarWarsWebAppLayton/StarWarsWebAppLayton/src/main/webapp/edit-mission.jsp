<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit An Existing Mission</title>
</head>
<body>
    <form action="editMissionDetailsServlet" method="post">
        <input type="hidden" name="id" value="${missionToEdit.id}">
        Mission Name: <input type="text" name="missionName" value="${missionToEdit.missionName}"><br>
        Force User: <input type="text" name="forceUserName" value="${missionToEdit.forceUser.name}"><br>
        <!-- Add more fields as necessary -->
        <input type="submit" value="Edit Mission">
    </form>
    <a href="index.html">Go back to the main page.</a>
</body>
</html>