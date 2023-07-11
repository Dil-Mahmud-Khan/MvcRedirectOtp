<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Help Page</h3>
<%
	String name=(String)	request.getAttribute("name");
	Integer roll=(Integer) request.getAttribute("roll");
%>

<h2>My Name is:${name}


<%--<%=name %> --%> 
 
</h2>
<h3>My id is ${roll} <%--<%=name %> --%></h3>

</body>
</html>