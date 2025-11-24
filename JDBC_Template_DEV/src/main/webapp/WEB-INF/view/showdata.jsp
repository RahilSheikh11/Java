<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Critical Data</title>
</head>
<body>
<p> Student Data</p>
<table border="3">
<tr>
<th>ID</th>
<th>Student Username</th>
<th>Password</th>
</tr>

<c:forEach var="user" items="${users}">
<tr>
<td>${user.id}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td><a href= "edit?id=${user.id}">Edit</a></td>
<td><a href="delete?id=${user.id}">Delete</a></td>
</tr>

</c:forEach>

</table>
</body>
</html>