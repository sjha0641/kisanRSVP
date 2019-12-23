<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="#" method="post" enctype="multipart/form-data">


<p>Personal Details</p><br>
Full Name <input type="text" name="name"/> <br/>
Contact no <input type="number" name="contact no"/> <br/>
Enter Your E-mail Id <input type="text" name="email"/> <br/>


<p> Address Details</p><br>
City <input type="text" name="city" /> <br/>
State <input type="text" name="state"/> <br/>
Pin Code <input type="number" name="pincode"/> <br/>

<p>Land Details</p><br>
Area <input type="number" name="city" /> <br/>
Address <input type="text" name="address"/> <br/>
Pin Code <input type="number" name="pincode"/> <br/>

<p>Bank Details</p><br>
Account No. <input type="number" name="accountno" /> <br/>
IFSC Code <input type="text" name="ifsccode"/> <br/>
<p>Document Upload</p><br>
Aadhaar<input type="file" name="aadhaar"/><br>   
PAN<input type="file" name="pan"/><br>   
Certificate<input type="file" name="certificate"/><br>

<button type="submit">REGISTER</button>
<button type="submit">RESET</button>
</form>
</body>
</html>