<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registrationFarmer.rsvp" method="post" enctype="multipart/form-data">


<p>Personal Details</p><br>
Full Name <input type="text" name="farmerFullName" /> <br/>
Contact no <input type="number" name="farmerContact"/> <br/>
Enter Your E-mail Id <input type="text" name="email"/> <br/>


<p> Address Details</p><br>
<input type="text" name="farmerAddressLine1" placeholder="farmerAddressLine1"/> <br/>
<input type="text" name="farmerAddressLine2" placeholder="farmerAddressLine2"/> <br/>
City <input type="text" name="farmerCity" /> <br/>
State <input type="text" name="farmerState"/> <br/>
Pin Code <input type="number" name="farmerPinCode"/> <br/>

<p>Land Details</p><br>
Area <input type="number" name="farmerLandArea" /> <br/>
Address <input type="text" name="farmerLandAddress"/> <br/>
Pin Code <input type="number" name="farmerLandPinCode"/> <br/>

<p>Bank Details</p><br>
Account No. <input type="number" name="farmerAccountNo" /> <br/>
IFSC Code <input type="text" name="farmerIFSCCode"/> <br/>
<p>Document Upload</p><br>
Aadhaar<input type="file" name="farmerAadhaarfile"/><br>   
PAN<input type="file" name="farmerPanfile"/><br>   
Certificate<input type="file" name="farmerCertificatefile"/><br>

password<input type="password" name="password" placeholder="password"/> <br/>
confirm password<input type="text" name="confirmpassword" placeholder="confirmpassword"/> <br/>

<button type="submit">REGISTER</button>
<button type="submit">RESET</button>
</form>
</body>
</html>