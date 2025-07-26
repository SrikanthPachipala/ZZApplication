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


	<div class="container mt-3">

		<h1>Add Employee Form</h1>
		<div class="row">

			<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Phonenumber</th>
        <th>city</th>
        
    </tr>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
             <td>${student.surname}</td>
              <td>${student.phoneNumber}</td>
            <td>${student.city}</td>
              <td>
                <a href="./updateStudent/${student.id}">Update</a>
            </td>
        </tr>
    </c:forEach>
</table>
		</div>
	</div>

</body>
</html>