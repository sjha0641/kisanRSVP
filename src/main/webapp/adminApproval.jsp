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
			<li><a href="fetchAllUnverifiedCrops.rsvp">Crop Approval</a></li>
			<li><a href="fetchAllBidding.rsvp">Bidding Approval</a></li>
			<li><a href="fetchSoldBidding.rsvp">Sold Crops</a></li>
			<li><a href="adminLogout.rsvp">LogOut</a></li>
		</ul>
	</div>
	<h4>_____Crop Status______</h4>
	<table border="1">
		<tr>
			<th>Type</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>Basic Price</th>
			<th>Sold Price</th>
			<th>Current Bid</th>
			<th>Status</th>
		</tr>
	<c:forEach items="${ listOfUnverifiedCrops }" var="Crop">
		<tr>
			<form action="approve.rsvp">
			<td>${ Crop.cropType}</td>
			<td>${ Crop.cropName}</td>
			<td>${ Crop.cropQuantity }</td>
			<td>${ Crop.cropBasicPrice }</td>
			<td>${ Crop.cropSoldPrice }</td>
			<td>${ Crop.cropCurrentBid }</td>
			<td>	
			<input type="text" name="cropId" value="${ Crop.cropId }" hidden/>
			<input type="submit"  value="Approve" /></td>
			</form>
		</tr>
	</c:forEach>
</table>
<h4>${ noCrops }</h4>

<a href="fetchAllApprovedCrops.rsvp">List of Approved Crops</a>
</body>
</html>