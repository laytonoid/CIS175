<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Delete Force User</title>
</head>
<body>
    <h2>Are you sure you want to delete this Force User?</h2>
<%@ page import="model.ForceUser" %>
<% ForceUser userToDelete = (ForceUser) request.getAttribute("userToDelete"); %>
<form action="deleteForceUserServlet" method="post">
	Are you sure you want to delete: <%= userToDelete.returnForceUserDetails() %>?
	<input type="hidden" name="id" value="<%= userToDelete.getId() %>">
	<input type="submit" value="Delete">
</form>

    <a href="viewAllForceUsers.jsp">No, Go Back</a>

</body>
</html>