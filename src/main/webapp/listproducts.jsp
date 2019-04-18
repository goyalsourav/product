<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Products</title>
</head>
<body>

	<h3>Product Details</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				
								
			</tr>
		</thead>
		<tbody>
			<c:forEach var="products" items="${PRODUCTSLIST}">
				<tr>
					<td>${products.id}</td>
					<td>${products.name}</td>
					<td>${products.price}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>