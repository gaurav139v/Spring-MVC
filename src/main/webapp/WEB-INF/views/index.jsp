<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

<h1>Home Page</h1>
<%
	String name = (String) request.getAttribute("Name");
%>

<p>Hello <%=name%></p>
</body>
</html>