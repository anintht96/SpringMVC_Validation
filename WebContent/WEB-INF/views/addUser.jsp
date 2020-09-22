<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.error{
		color: red;
	}
</style>
<meta charset="UTF-8">
<title>Add USer</title>
</head>
<body>

	<form:form action="addUser" modelAttribute="user" method="post">
		<table>
			<tr>
				<td>Id </td>
				<td> <form:input path="id" type=""/> </td>
				<td> <form:errors path="id" cssClass="error"></form:errors>
			</tr>
			<tr>
				<td>Name </td>
				<td> <form:input path="name"/> </td>
				<td> <form:errors path="name" cssClass="error"></form:errors>
			</tr>
			<tr>
				<td>Email </td>
				<td> <form:input path="email"/> </td>
				<td> <form:errors path="email" cssClass="error"></form:errors>
			</tr>
			<tr>
				<td>Tuoi </td>
				<td> <form:input path="tuoi"/> </td>
				<td> <form:errors path="tuoi" cssClass="error"></form:errors>
			</tr>
			<tr>
				<td>PhoneNumber </td>
				<td> <form:input path="phoneNumber"/> </td>
				<td> <form:errors path="phoneNumber" cssClass="error"></form:errors>
			</tr>
			<tr>
				<td>DateOfBirth </td>
				<td> <form:input path="dateOfBirth"/> </td>
				<td> <form:errors path="dateOfBirth" cssClass="error"></form:errors>
			</tr>
			<tr>
				<td colspan="3"> <input type="submit" value="Add">
			</tr>
		</table>
	</form:form>	
 
</body>
</html>