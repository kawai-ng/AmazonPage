<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home Page</title>
	<link href="${pageContext.request.contextPath}/resources/homepage.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="titleWrapper">
	<h1>Welcome!</h1>
	<P>  The time on the server is ${serverTime}. </P>
	<p> What would like to do today?</p>
</div>

<div class="buttonWrapper">
	<form action = "addAddress" method="post">
		<button class="addressButton" type = "submit" value = "Add New Address">
			<img src="${pageContext.request.contextPath}/resources/plus.png" alt="Plus Sign">
			<p>Add New Address</p>
		</button>
	</form>

	<form action = "deleteAddress" method="post">
		<button class="addressButton" type = "submit" value = "Delete Address">
			<img src="${pageContext.request.contextPath}/resources/delete.png" alt="Delete Sign">
			<p>Delete Address</p>
		</button>
	</form>

	<form action = "editAddress" method="post">
		<button class="addressButton" type = "submit" value = "Edit Address">
			<img src="${pageContext.request.contextPath}/resources/edit.png" alt="Edit Sign">
			<p>Edit Address</p>
		</button>
	</form>

	<form action = "addressList" method="post">
		<button class="addressButton" type = "submit" value = "View Address">
			<img src="${pageContext.request.contextPath}/resources/view.png" alt="View Sign">
			<p>View Addresses</p>
		</button>
	</form>
</div>

</body>
</html>
