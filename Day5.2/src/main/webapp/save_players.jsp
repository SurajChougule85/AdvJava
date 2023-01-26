<%@page import="bol.Player"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="display.jsp">Display player details</a>

<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String city=request.getParameter("city");

	Player players=new Player(id,name,city);
	
	session.setAttribute("players_details", players);

	//String url=response.encodeURL("display")
%>




</body>
</html>