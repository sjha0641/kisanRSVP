<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approved Bids</title>
<link rel="stylesheet" href="adminLogin.css">
</head>
<body>
<h1>${sessionScope.loggedInAdmin.adminEmail }</h1>
	<div>
		<ul>
			<li><a class="active" href="adminDashboard.jsp">Home</a></li>
			<li><a href="fetchAllUnverifiedCrops.rsvp">Crop Approval</a></li>
			<li><a href="fetchAllBidding.rsvp">Bidding Approval</a></li>
			<li><a href="adminLogin.jsp">LogOut  ${ Session.Abandon }</a></li>
		</ul>
	</div>
	<h4>_____Bid Status______</h4>
	<table border="1">
		<tr>
			<th>Bid Id</th>
			<th>Bid Amount</th>
			<th>Status</th>
		</tr>
	<c:forEach items="${ listOfBidding }" var="bid">
		<tr>
			<form action="approveBid.rsvp">
			<td>${ bid.bidId}</td>
			<td>${ bid.bidAmount}</td>
			<td><input type="submit"  value="Approve"/></td>
			</form>
		</tr>
	</c:forEach>
</table>
</body>
</html>