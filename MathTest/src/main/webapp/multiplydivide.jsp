<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Multiplication and Division Test</title>
</head>
<body>
<h1>Multiplication and Division Test</h1>
<form action="MultiplyDivideServlet" method="post">
    3 x 4 = <input type="text" name="answer1" size="5"><br>
    8 / 2 = <input type="text" name="answer2" size="5"><br>
   2 x 2 = <input type="text" name="answer3" size="5"><br>
     10 / 2 = <input type="text" name="answer4" size="5"><br>
    7 x 2 = <input type="text" name="answer5" size="5"><br><br>
    <input type="submit" value="Submit Test">
 	</form>
</body>
</html>