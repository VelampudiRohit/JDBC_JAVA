<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ltts.productionsproject.model.*,com.ltts.productionsproject.dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Productions</title>
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

input[type=number] {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=number]:focus {
  background-color: lightblue;
}
</style>
</head>
<body>
<%
ProductionsDao pd=new ProductionsDao();
int id=Integer.parseInt(request.getParameter("id"));
List<Productions> li=pd.getAllProductions();
Productions p=null;
for(Productions p1:li){
	if(p1.getProductionid()==id){
		p=p1;
	}
	
}

%>
<h1>Update Productions here</h1> <br>

<form action="./UpdateProductionsController" method="post">

Productions Id you want to update: <input type="number" name="pid" value="<%=p.getProductionid()%>"><br><br>

Productions Name: <input type="text" name="pname" value="<%=p.getProductionname()%>"><br><br>

Productions Address: <input type="text" name="address" value="<%=p.getAddress()%>"><br><br>

Productions Year: <input type="number" name="year" value="<%=p.getStartyear()%>"><br><br>

Productions Owner: <input type="text" name="owner" value="<%=p.getOwnername()%>"><br><br>


<input type="submit" value="Update productions"><br><br>

</form>
</body>
</html>