<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	/*
	cek apakah user melakukan 'back' di browser setelah logout (clean cache)
	*/
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
	response.setHeader("Expires", "0"); //Proxies

	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	videos Page
	<br>
	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/cYc3FjhMMzI"
		title="YouTube video player" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
		allowfullscreen></iframe>
	<br>
	<a href="welcome.jsp">Welcome Page</a>
	<br>
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>