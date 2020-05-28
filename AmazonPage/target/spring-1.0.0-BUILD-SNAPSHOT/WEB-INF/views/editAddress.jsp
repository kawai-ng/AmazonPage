<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Address Page</title>
</head>
<body>

Enter information to change, ID must be correct

<form action = "editAddressDisplay" method="post">
	Customer id : <input type="text" name="id"> <br/>
	Customer country : <input type="text" name="country"> <br/>
	Customer name : <input type="text" name="name"> <br/>
	Customer street1 : <input type="text" name="street1"> <br/>
	Customer street2 : <input type="text" name="street2"> <br/>
	Customer City : <input type="text" name="city"> <br/>
	Customer State : <input type="text" name="state"> <br/>
	Customer Zip Code : <input type="text" name="zipcode"> <br/>
	Customer Phone : <input type="text" name="phone"> <br/>
	<input type = "submit" value = "send">
</form>


</body>
</html>