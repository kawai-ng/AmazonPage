<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info Page</title>
</head>
<body>

Display Page

<table width = "500" cellpadding = "0" cellspacing = "0" border="1">
	<tr> 
		<td> Id </td>
		<td> Country </td>
		<td> Name </td>
		<td> Street1 </td>
        <td> Street2 </td>
        <td> City </td>
        <td> State </td>
        <td> Zip Code </td>
        <td> Phone </td>
	</tr>
	<c:forEach items ="${list}" var = "dto"> 
	<tr>
		<td> ${dto.id} </td>
        <td> ${dto.country} </td>
        <td> ${dto.name} </td>
        <td> ${dto.street1} </td>
        <td> ${dto.street2} </td>
        <td> ${dto.city} </td>
		<td> ${dto.state} </td>
		<td> ${dto.zipcode} </td>
		<td> ${dto.phone} </td>
	</tr>
	</c:forEach>
	
</table>

<form action = "/" method="get">
	<input type = "submit" value = "Back to Home">
</form>
</body>
</html>