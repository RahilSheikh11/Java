<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%User u=(User) request.getAttribute("edit"); %>
<form action="updateData" method="post" enctype="multipart/form-data">
 <input type="text" class="form-control" placeholder="Full Name" name="username" required value="<%=u.getUsername()%>">
         	<input type="hidden" name="id" value="<%=u.getId() %>">
              <input type="email" class="form-control" placeholder="Email" name="email" required value="<%=u.getEmail()%>">
              
              <input type="text" class="form-control" placeholder="Phone Number" name="phone" required value="<%=u.getPhone()%>">
           
              <input type="password" class="form-control" placeholder="Password" name="password" required value="<%=u.getPassword()%>">
				
			<img src ="showimage?id=<%=u.getId()%>" width ="100px" height="100px" border="4px"/>
         <input type="file" name="image">
            <input type="submit" class="btn btn-primary w-100" value="Update" name="action">
            

            </form>
</body>
</html>