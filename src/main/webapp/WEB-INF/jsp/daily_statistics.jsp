<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page import = "java.sql.Timestamp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Daily statistics</title>
<link rel = "stylesheet" href = '<c:url value = "/resources/css/Style.css"/>' 
type="text/css"/>
</head>
<body>

	<c:forEach items = "${statistics}" var = "stats">
		<table>
			<tr>
				<td><fmt:formatDate pattern = "dd-MM-yyyy" value = "${stats.date}"></fmt:formatDate></td>
				<td>Demand (${stats.demand})</td>
				<td>Generation(${stats.generation})</td>
				<td>${stats.engine} ${stats.turbine}</td>
				<td>${stats.fuelType} ${stats.cycle}</td>
				<td>Auxiliary Generation (${stats.auxiliaryGenertion})</td>
			</tr>
		</table>
	</c:forEach>

</body>
</html>