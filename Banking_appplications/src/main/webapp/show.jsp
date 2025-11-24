<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<User> list= (List<User>)request.getAttribute("list");

%>
<table border="5px">
<tr>

<td>ID</td>
<td>Username</td>
<td>Phone</td>
<td>Email</td>
<td>Password</td>
</tr>
<%
for(User u:list)
{
%>
	<tr>
	
	<td><%=u.getId()%></td>
	<td><%=u.getUsername() %></td>
	<td><%=u.getPhone() %></td>
	<td><%=u.getEmail() %></td>
	<td><%=u.getPassword()%></td>
	<!-- for each user row, call servlet with that user id -->
	<td><img src="showimage?id=<%=u.getId()%>" alt="User image" width="70" height="70"></td>
	<td><a href="insertPage?action=edit&id=<%=u.getId() %>">Edit</a></td>
	<td><a href="insertPage?action=delete&id=<%=u.getId() %>">Delete</a></td>
	</tr>
<%} %>
	
</table>

</body>
</html>