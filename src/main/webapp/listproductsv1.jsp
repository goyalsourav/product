<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Product Details</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Category</th>
								
			</tr>
		</thead>
		<tbody>
			<c:forEach var="products" items="${PRODUCTSLIST}">
				<tr>
					<td>${products.id}</td>
					<td>${products.name}</td>
					<td>${products.price}</td>
					<td>${products.category}</td>
				</tr>
			</c:forEach>
</tbody>
</table>
</body>
</html>