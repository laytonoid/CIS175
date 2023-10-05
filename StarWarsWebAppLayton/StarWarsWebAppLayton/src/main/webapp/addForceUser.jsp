<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Add Force User</title>
</head>
<body>
    <h2>Add Force User</h2>

<form action="AddForceUserServlet" method="post">
    Name: <input type="text" name="name"><br>
    Affiliation: <input type="text" name="affiliation"><br>
    Lightsaber Color: <input type="text" name="lightsaberColor"><br>
    <input type="submit" value="Add Force User">
</form>
    <a href="index.jsp">Back to Home</a>
</body>
</html>