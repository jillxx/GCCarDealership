<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Dealership</title>
</head>
<body>
<h1>Car Dealership Welcomepage</h1>
<br>
<h1>Select a make: </h1>
<form action="make">
<select name="make">
	<option value="Ford">Ford</option>
	<option value="Honda">Honda</option>
	<option value="Toyota">Toyota</option>
</select>
<input type="submit" value="Submit">
</form>
<br>
<h1>Enter a model: </h1>
<form action="model">
<input type="text" name="model">
<input type="submit" value="Submit">
</form>
<br>
<h1>Enter a year: </h1>
<form action="year">
<input type="text" name="year">
<input type="submit" value="Submit">
</form>
<br>
<h1>Select a color: </h1>
<form action="color">
<select name="color">
	<option value="Silver">Silver</option>
	<option value="Red">Red</option>
	<option value="Black">Black</option>
</select>
<input type="submit" value="Submit">
</form>
</body>
</html>