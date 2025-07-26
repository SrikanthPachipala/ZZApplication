<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Add Student</title>
</head>
<body>
	<h2>Add Student</h2>
	<form action="${pageContext.request.contextPath}/save" method="post">
		Name: <input type="text" name="name" /><br /> Surname: <input
			type="text" name="surname" /><br /> Phone Number: <input
			type="text" name="phoneNumber" /><br /> City: <input type="text"
			name="city" /><br /> <input type="submit" value="Save" />
	</form>
</body>
</html>
