<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Welcome!
</h1>
<P>  The time on the server is ${serverTime}. </P>

What would like to do today?

<form action = "addAddress" method="post">
<input type = "submit" value = "Add New Address">
</form>

<form action = "deleteAddress" method="post">
	<input type = "submit" value = "Delete Address">
</form>

<form action = "editAddress" method="post">
	<input type = "submit" value = "Edit Address">
</form>

<form action = "addressList" method="post">
	<input type = "submit" value = "View Address">
</form>
</body>
</html>
