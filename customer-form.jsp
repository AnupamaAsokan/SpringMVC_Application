<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer Registration Form</title>
<style>
.error {color.red
		 }
</style>
</head>

<body>
	<i>Fill out the below form.(*) means required</i>

	<form:form action="processForm" modelAttribute="customer">
FirstName: <form:input path="firstName" />
		<br>
		<br>
LastName(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
Free Passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br>
		<br>
Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<br>
Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error"></form:errors>
		<br>
		<br>		
		<input type="submit" value="submit" />
	</form:form>


</body>
</html>