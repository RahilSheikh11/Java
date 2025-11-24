<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login | Feane Restaurant</title>
  <link rel="stylesheet" href="css/login.css">
</head>
<body>
  <div class="login-container">
    <h2>Login</h2>
    <form action="login_action.php" method="post">
      <div class="input-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" placeholder="Enter Username" required>
      </div>
      <div class="input-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter Password" required>
      </div>
      <input type="submit" class="btn" value="insert">
      <p class="signup-text">Don't have an account? <a href="registeration.jsp">Sign up</a></p>
    </form>
  </div>
</body>
</html>
