<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add Address Page</title>
	<link href="${pageContext.request.contextPath}/resources/addressForms.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>Add New Address Form</h1>
<form action = "addAddressDisplay" method="post">
	<table>
		<tr>
			<td>ID : </td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>Country : </td>
			<td><input type="text" name="country"></td>
		</tr>
		<tr>
			<td>Name : </td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Street Line 1 : </td>
			<td><input type="text" name="street1"></td>
		</tr>
		<tr>
			<td>Street Line 2 : </td>
			<td><input type="text" name="street2"></td>
		</tr>
		<tr>
			<td>City: </td>
			<td><input type="text" name="city"></td>
		</tr>
		<tr>
			<td>State : </td>
			<td><input type="text" name="state"></td>
		</tr>
		<tr>
			<td>Zip Code : </td>
			<td><input type="text" name="zipcode"></td>
		</tr>
		<tr>
			<td>Phone Number: </td>
			<td><input type="text" name="phone"></td>
		</tr>
		<tr>
			<td><input type = "submit" value = "send"></td>
		</tr>
	</table>
</form>
</body>
</html>