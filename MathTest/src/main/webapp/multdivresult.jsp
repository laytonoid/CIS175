<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Multiplication and Division Results</title>
</head>
<body>
    <p>Multiplication and division test score: <br />
   ${testScore.getScore()} out of 5 <br />
      </p>
    <a href="index.jsp">Take another test?</a>
</body>
</html>