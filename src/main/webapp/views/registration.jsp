<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveStudent" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>NAME:
				<td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>EMAIL:
				<td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>PHNO:
				<td></td>
				<td><input type="text" name="phno"></td>
			</tr>

			<tr>
				<td>GENDER:</td>
				<td>
			<!--  	<form:radiobottons path="gender" items="${gender}" />   -->
				</td>
			</tr>
			
			<tr>
				<td>COURSES</td>

				<td><form:select path="course">
						<form:options items="${course}" />
					</form:select></td>
			</tr>


			<tr>
				<td>Timings:</td>
				<td><form:checkboxes items="${timings}" path="timing" /></td>

				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
></form:form>

</body>
</html>