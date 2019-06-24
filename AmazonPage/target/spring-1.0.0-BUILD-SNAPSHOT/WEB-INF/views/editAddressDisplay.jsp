<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>

Confirm Information
<br>
ID : ${customerId} <br>
Country : ${customerCountry} <br>
Name : ${customerName} <br>
Street1 : ${customerStreet1} <br>
Street2 : ${customerStreet2} <br>
City : ${customerCity} <br>
State : ${customerState} <br>
Zip Code : ${customerZipcode} <br>
Phone : ${customerPhone} <br>

<form action = "/" method="get">
    <input type = "submit" value = "Back to Home">
</form>
</body>
</html>