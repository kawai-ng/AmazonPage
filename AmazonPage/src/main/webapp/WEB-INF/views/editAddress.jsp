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
	customer id : <input type="text" name="id"> <br/>
	customer country : <input type="text" name="country"> <br/>
	customer name : <input type="text" name="name"> <br/>
	customer street1 : <input type="text" name="street1"> <br/>
	customer street2 : <input type="text" name="street2"> <br/>
	customer city : <input type="text" name="city"> <br/>
	customer state : <input type="text" name="state"> <br/>
	customer zipcode : <input type="text" name="zipcode"> <br/>
	customer phone : <input type="text" name="phone"> <br/>
	<input type = "submit" value = "send">
</form>


</body>
</html>