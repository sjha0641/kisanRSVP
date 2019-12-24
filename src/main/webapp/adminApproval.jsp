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
			<li><a href="adminApproval.jsp">Approval</a></li>
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
	<c:forEach items="${ listOfFarmers }" var="farmer">
		<tr>
			<td>${farmer.farmerId }</td>
			<td>${farmer.farmerFullName }</td>
			<td>${farmer.farmerContact }</td>	
			<td><button type="submit" name="approve">Approve</button></td>
		</tr>
	
	</c:forEach>
</table>

</body>
</html>