<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>


<%-- <s:url var="url_jqlib" value="/resources/js/jquery-3.6.0.min.js" />
<script src="${url_jqlib}"> </script> --%>


<%@page isELIgnored="false"%>




<title><c:out value="${title }"> home page</c:out></title>
</head>
<body>
<h1>welcome to updte pag</h1>
<form action="${pageContext.request.contextPath}/updateStd" method="post">
    <input type="hidden" name="id" value="${student.id}" />
    Name: <input type="text" name="name" value="${student.name}" /><br/>
    City: <input type="text" name="city" value="${student.city}" /><br/>
    Surname: <input type="text" name="surname" value="${student.surname}" /><br/>
   Phonenumber: <input type="text" name="phoneNumber" value="${student.phoneNumber}" /><br/>
    <input type="submit" value="Update Student" />
</form>
</body>
</html>