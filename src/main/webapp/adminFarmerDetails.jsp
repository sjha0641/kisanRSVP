<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farmer Details</title>
<link rel="stylesheet" href="adminLogin.css">
</head>
<body>
<h1>${sessionScope.loggedInAdmin.adminEmail }</h1>
	<div>
		<ul>
			<li><a class="active" href="adminDashboard.jsp">Home</a></li>
			<li><a href="#">Approval</a></li>
			<li><a href="adminLogin.jsp">LogOut  ${ Session.Abandon }</a></li>
		</ul>
	</div>
	<table border="1">
	<c:forEach items="${ listOfFarmers }" var="farmer">
		<tr>
			<td>${farmer.farmerFullName }</td>
			<td>${farmer.farmerContact }</td>	
		</tr>
	
	</c:forEach>
</table>
	
</body>
</html>