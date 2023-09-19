<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Math Tests Home Page</title>
</head>
<body>
    <h1>The Hardest Math Tests Ever</h1>
    <form action="SelectTestServlet" method="post">
     PLEASE SELECT A TEST:<br> <select name="testType">
    <option value="addsubtract">Addition/Subtraction</option>
    <option value="multiplydivide">Multiplication/Division</option>
    </select><br><br>
     <input type="submit" value="Start Test" />
    </form>
</body>
</html>