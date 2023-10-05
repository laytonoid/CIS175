<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Force Users List</title>
</head>
<body>

<h2>Force Users List</h2>

<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Lightsaber Color</th>
            <th>Affiliation</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${allForceUsers}" var="currentUser">
            <tr>
                <td>${currentUser.name}</td>
                <td>${currentUser.lightsaberColor}</td>
                <td>${currentUser.affiliation}</td>
                <td>
                    <form action="EditForceUserServlet" method="post">
                        <input type="hidden" name="id" value="${currentUser.id}" />
                        <input type="submit" value="Edit" />
                    </form>
                    <form action="DeleteForceUserServlet" method="post">
                        <input type="hidden" name="id" value="${currentUser.id}" />
                        <input type="submit" value="Delete" />
                    </form>
                </td>
            </tr>

        </c:forEach>
    </tbody>
</table>
<a href="index.html">Return Home</a> <br />
</body>