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
	int dataNum1 = Integer.parseInt(request.getParameter("num1"));
	int dataNum2 = Integer.parseInt(request.getParameter("num2"));

	int addData = dataNum1 + dataNum2;

	out.print("Output2: " + addData);
	%>
</body>
</html>