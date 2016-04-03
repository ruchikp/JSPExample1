<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Record</title>
</head>
<body>
	
	<form action="Insertdata" method="post">

	<table>
	
		<tr>
			<td> ID </td>
			<td><input type="text" name="id"></td>
		</tr>
		
		<tr>
			<td> FirstName </td>
			<td><input type="text" name="firstname"></td>
		</tr>
	
		<tr>
			<td> LastName </td>
			<td><input type="text" name="lastname"></td>
		</tr>
		<tr>
			<td> Salary </td>
			<td><input type="text" name="salary"></td>
		</tr>
		<tr>
			<td> Address </td>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<td>  </td>
			<td><input type="submit" value="submit"></td>
		</tr>
	
	
	
	
	
	</table>

	</form>

</body>
</html>