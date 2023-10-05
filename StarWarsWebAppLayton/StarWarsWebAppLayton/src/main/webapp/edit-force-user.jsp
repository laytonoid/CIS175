<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Force User Details</title>
</head>
<body>
<form action ="EditForceUserServlet" method="post">
    <input type="hidden" name="id" value="${forceUserToEdit.id}">

    Name: <input type="text" name="name" value="${forceUserToEdit.name}"><br/>
    Lightsaber Color: <input type="text" name="lightsaberColor" value="${forceUserToEdit.lightsaberColor}"><br/>
    Affiliation: <input type="text" name="affiliation" value="${forceUserToEdit.affiliation}"><br/>
    <input type="submit" value="Update">
</form>
</body>
</html>