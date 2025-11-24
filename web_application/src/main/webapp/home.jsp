<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1:hover
{
background-color: navy;
color: golden;
text-transform: uppercase;
}
</style>
<meta charset="UTF-8">
<title>First Project</title>
</head>
<body>
<form action="home.jsp" method="post">
<table>
<tr>
<th style="background-color: navy blue; color: red;">
Name
</th>
<th style="background-color: navy blue; color: red;">
City
</th>
<th style="background-color: navy blue; color: red;">
Language
</th>
<th style="background-color: navy blue; color: red;">
Local
</th>
</tr>

<tr>

<td style="font-family: Bold:font-size: 14px: color: Grey;">
Jafrabad
</tr>
<tr>
<td>
Name
</td>
<td>
<input type="text name="name" required="required">
</td>
</tr>

<tr>
<td>
Password
</td>
<td>
<input type="password" name="password" required="required">
</td>
</tr>

<tr>
<td>
Gender
</td>
<td>
Male<input type="radio" name="gender">
Female<input type="radio" name="gender">
Not sure<input type="radio" name="gender">
</td>
</tr>

<tr>
<td>
Language
</td>
<td>
English
<input type="checkbox" name="Language">
Gujarati
<input type="checkbox" name="Language">
Hindi
<input type="checkbox" name="Language">
Not sure
<input type="checkbox" name="Language">
</td>
</tr>

<tr>
<td>
</td>
<td>
</td>
<td>
<select name="city">
<option value="Baroda">Baroda</option>
<option value="Baroda">Naroda</option>
<option value="Baroda">Daroda</option>
</select>
</td>
</tr>

<tr>
<td>
Email
</td>
<td>
<input type="email" name="email" required="required">
</td>
</tr>
<tr>
<td>
Date
</td>
<td>
<input type="date" name="date">
</td>
</tr>

<tr>
<td>
</td>
<td>
<input type="submit" value="Final che Final">
<input type="reset" value="Fari thi form bharo">
</td>
</tr>
</table>

<h1> h1 tag  </h1>


</form>
</body>
</html>