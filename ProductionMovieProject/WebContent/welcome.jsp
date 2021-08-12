<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
body {
  background-color: lightgray;
  opacity: 0.9;
  font-family: Arial, Helvetica, sans-serif;
}
a:link, a:visited {
  background-color: #f44336;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: red;
}
</style>
</head>
<body>
Hey, <%= request.getSession().getAttribute("email") %><br><br><br><br><br>
 
<a href="viewprods.jsp">View productions here</a><br><br>
<a href="viewmovies.jsp">View movies here</a><br><br>
<a href="viewmoviesbylanguage.jsp">View movies by language here</a><br><br>
</body>
</html>