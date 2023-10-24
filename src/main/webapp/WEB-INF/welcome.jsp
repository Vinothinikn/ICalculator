<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
<h1 align = "center"> Welcome to Love Calculator</h1>
<div align = "center">
<form:form action = "process" method = "get" modelAttribute = "userInfo">
<p>
<label for = "name">Name: </label>
<form:input name = "name" id = "name" path = "name"/> 
</p>

<p>
<label for = "crushName">Crush Name: </label>
<form:input  name = "crushName" id = "crushName" path = "crushName"/> 
</p>

<input type = "submit" value = "calculate" />
</form:form>


</div>
</body>
</html>