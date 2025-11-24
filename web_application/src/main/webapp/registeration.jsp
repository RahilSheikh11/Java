<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <link rel="stylesheet" type="text/css" href="css/registration.css">
</head>
<body>
    <div class="register-container">
        <h2>User Registration</h2>
        <form action="insertPage" method="post">
            <div class="input-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="input-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <input type="submit" class="btn" value="Submit">Register
            <div class="login-text">
                <p>Already have an account? <a href="Login.jsp">Login here</a></p>
            </div>
        </form>
    </div>
</body>
</html>
