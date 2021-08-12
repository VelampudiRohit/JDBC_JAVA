<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ltts.productionsproject.model.*,com.ltts.productionsproject.dao.*,java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ProductionsDao pd=new ProductionsDao();
List<Productions> li=pd.getAllProductions();
%>
<a href="index.html">Home</a><br><br>
<table>
<tr>
<th>id</th>
<th>name</th>
<th>address</th>
<th>startyear</th>
<th>Ownername</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach items="${li }" var="p">
<tr>
<td><c:out value="${p.getProductionid()}"></c:out></td>
<td><c:out value="${p.getProductionname()}"></c:out></td>
<td><c:out value="${p.getAddress()}"></c:out></td>
<td><c:out value="${p.getStartyear()}"></c:out></td>
<td><c:out value="${p.getOwnername()}"></c:out></td>
<td><a href="updateproductions.jsp?id=${p.getProductionid()}">Update productions</a></td>
<td><a href="deleteproductions.jsp?id=${p.getProductionid()}">Delete productions</a></td>
</tr>
</c:forEach> 
</table>
</body>
</html>