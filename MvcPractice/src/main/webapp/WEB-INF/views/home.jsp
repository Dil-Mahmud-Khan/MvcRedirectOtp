<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>This is homepage</h3>
<%
	String name=(String)	request.getAttribute("name");
	Integer id=(Integer) request.getAttribute("id");
	List<String> friends=(List<String>) request.getAttribute("f");
%>
<%
	for(String s: friends){
		
	
%>
<h3>Friends are: <%=s %></h3>
<%
	}
%>
<h2>My Name is: <%=name %></h2>
<h3>My id is <%=id %></h3>

</body>
