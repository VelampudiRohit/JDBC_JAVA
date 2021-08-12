<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ltts.productionsproject.model.*,com.ltts.productionsproject.dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteProductions</title>
<style> 
body {
  background-color: lightgray;
  opacity: 0.9;
  font-family: Arial, Helvetica, sans-serif;
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
<h1>Delete Productions here</h1> <br>
<form action="./DeleteProductionsController" method="post">

Productions Id you want to delete: <input type="number" name="pid" value="<%=p.getProductionid()%>"><br><br>



<input type="submit" value="Delete Productions"><br><br>
</form>
</body>
</html>