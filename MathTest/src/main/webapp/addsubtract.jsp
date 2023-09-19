<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Addition and Subtraction Test</title>
</head>
<body>
<h1>Addition and Subtraction Test</h1>
<form action="AddSubtractServlet" method="post">
    1 + 2 = <input type="text" name="answer1" size="5"><br>
    3 - 2 = <input type="text" name="answer2" size="5"><br>
    4 + 7 = <input type="text" name="answer3" size="5"><br>
    7 - 6 = <input type="text" name="answer4" size="5"><br>
    2 + 2 = <input type="text" name="answer5" size="5"><br><br>
    <input type="submit" value="Submit Test">
</form>
</body>
</html>