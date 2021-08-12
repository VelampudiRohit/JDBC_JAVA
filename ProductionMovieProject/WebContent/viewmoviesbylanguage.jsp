<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ltts.productionsproject.model.*,com.ltts.productionsproject.dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-color: lightgray;
  opacity: 0.9;
  font-family: Arial, Helvetica, sans-serif;
}
input[type=text] {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=text]:focus {
  background-color: lightblue;
}
#movie {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#movie td, #movie th {
  border: 1px solid #ddd;
  padding: 8px;
}
#movie tr:hover {background-color: #ddd;}

#movie th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
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
<a href="index.jsp">Home</a><br><br>
<form>
Language Name:<input type="text" name="language"><br><br>


<input type="submit" name="submit" value="Select Language"><br><br>
</form>
<%
String lang=request.getParameter("language");
MovieDao md=new MovieDao();
List<Movie> li=new ArrayList<Movie>();
if(lang!=null){
	out.println(lang+" Language movies are as below");
	if(lang.equals("All")){
		li=md.getAllMovie();
	}
	else{
		li=md.getAllMovie(lang);
	}
}
%>

<table id="movie">
<tr>
<th>id</th>
<th>name</th>
<th>hero</th>
<th>heroine</th>
<th>release date</th>
<th>language</th>
<th>length</th>
<th>movie type</th>
<th>production id</th>
</tr>
<%for(Movie m:li){ %>
<tr>
<td><%=m.getMovieid() %></td>
<td><%=m.getMoviename() %></td>
<td><%=m.getHeroname() %></td>
<td><%=m.getHeroine() %></td>
<td><%=m.getReleaseddate() %></td>
<td><%=m.getLanguage() %></td>
<td><%=m.getLength() %></td>
<td><%=m.getMovietype() %></td>
<td><%=m.getProductionid() %></td>
</tr>
<%} %>
</table>

</body>
</html>