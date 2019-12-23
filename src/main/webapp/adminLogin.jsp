<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" href="adminLogin.css">
</head>
<body>
<h3>${errorMsg}</h3>
<form action="adminLogin.rsvp" method="get">
		<div class="main">
		<h4 style="text-align: center">Admin</h4>
			<div class="gap">
				<label>Email</label> <input type="text" name="adminEmail">
			</div>
			<div class="gap">
				<label>Password</label> <input type="password" name="adminPassword">
			</div>
			<div class="gap">
			<button type="submit">login</button>
			</div>
		</div>
	</form>
</body>
</html>