<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approval</title>
<link rel="stylesheet" href="adminLogin.css">
</head>
<body>
<h1>${sessionScope.loggedInAdmin.adminEmail }</h1>
	<div>
		<ul>
			<li><a class="active" href="adminDashboard.jsp">Home</a></li>
			<li><a href="fetchAllFarmersUnverified.rsvp">Approval</a></li>
			<li><a href="adminLogin.jsp">LogOut  ${ Session.Abandon }</a></li>
		</ul>
	</div>
	<h4>_____Farmers for Approval______</h4>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact</th>
		</tr>
	<c:forEach items="${ listOfUnverifiedFarmers }" var="Crop">
		<tr>
			<td>${ Crop.cropType}</td>
			<td>${ Crop.cropName}</td>
			<td>${ Crop.cropQuantity }</td>	
			<td><a href="http://localhost:9090/rest/approve/${ Crop.cropId }">Approve</a></td>
		</tr>
	
	</c:forEach>
</table>

</body>
</html>