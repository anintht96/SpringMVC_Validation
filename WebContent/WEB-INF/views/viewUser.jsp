<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View User</title>
</head>
<body>

	<h2><a href="addUser"></a></h2>
	<div>
		<label>Id: ${user.id }</label>
		<label>Name: ${user.name }</label>
	</div>
</body>
</html>