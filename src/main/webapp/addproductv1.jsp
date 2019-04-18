<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Enter Product details</h3>
	<form action="products/savev1" method="post">
		Enter Product Id<input type="text" name="id" required autofocus /> <br>
		Enter Product Name<input type="text" name="name" required autofocus /> <br>
		Enter Product Price<input type="text" name="price" required autofocus/> <br>
		Enter Product Category<input type="text" name="category" required autofocus/> <br>
		
		<input type="submit" value="Add Product">
</form>
</body>
</html>