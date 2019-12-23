<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="adminLogin.css">
</head>
<body>
	<h1>${sessionScope.loggedInAdmin.adminEmail }</h1>
	<div>
		<ul>
			<li><a class="active" href="#">Home</a></li>
			<li><a href="#">Approval</a></li>
			<li><a href="adminLogin.jsp">LogOut  ${ Session.Abandon }</a></li>
		</ul>
	</div>
	<div><a href="fetchAllFarmers.rsvp">Listed Farmers</a></br></br></div>
	<div><a href="fetchAllBidders.rsvp">Listed Bidders</a></div>
</body>
</html>