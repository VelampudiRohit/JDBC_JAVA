<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.ltts.productionsproject.model.*,com.ltts.productionsproject.dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#productions {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#productions td, #productions th {
  border: 1px solid #ddd;
  padding: 8px;
}
#productions tr:hover {background-color: #ddd;}

#productions th {
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
<%
ProductionsDao pd=new ProductionsDao();
List<Productions> li=pd.getAllProductions();
%>
<a href="index.jsp">Home</a><br><br>
<table id="productions">
<tr>
<th>id</th>
<th>name</th>
<th>address</th>
<th>startyear</th>
<th>Ownername</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%for(Productions p:li){ %>
<tr>
<td><%=p.getProductionid() %></td>
<td><%=p.getProductionname() %></td>
<td><%=p.getAddress() %></td>
<td><%=p.getStartyear() %></td>
<td><%=p.getOwnername() %></td>
<td><a href="updateproductions.jsp?id=<%=p.getProductionid()%>">Update productions</a></td>
<td><a href="deleteproductions.jsp?id=<%=p.getProductionid()%>">Delete productions</a></td>
</tr>
<%} %>
</table>
</body>
</html>