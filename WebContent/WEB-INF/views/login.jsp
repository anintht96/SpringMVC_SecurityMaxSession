<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	<h1>Spring MVC Security 5: <br> Maximum concurrent users </h1>
	<h3>${message }</h3>
	
	<form action="<c:url value='/j_spring_security_login'/>" method="post">
		<table>
			<tr>
				<td>Username: </td>
				<td> <input type="text" name="username"> </td> 
			</tr>
			<tr>
				<td>Password: </td>
				<td> <input type="password" name="password"> </td>
			</tr>
			<tr>
				<td colspan="2"> <button type="submit">Login</button>
			</tr>
		</table>
	</form>

</body>
</html>