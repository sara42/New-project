<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>SpSignUp</title>
</head>
<body>
	<h1>Please fill your data in order to sign up !</h1>
	<form action="/newproject/spring/signup" method="POST">
		<p>Name</p>
		<input type="text" name="UserName" size="50">
		<p>Email</p>
		<input type="text" name="UserEmail" size="50">
		<p>Address</p>
		<input type="text" name="UserAdress" size="50">
		<p>Age</p>
		<input type="number" name="UserAge" size="50">
		<p>Salary</p>
		<input type="number" name="UserSalary" size="50"> <br> <br>
		<input type="submit" value="SignUp" />
	</form>
</body>
</html>