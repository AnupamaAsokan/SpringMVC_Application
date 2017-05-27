<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html> 
<head>
<title> Student Registration Form</title>
</head>

<body>
<form:form action="processForm" modelAttribute ="student">
FirstName: <form:input path="firstName"/>
<br><br>
LastName: <form:input path="lastName"/>
<br><br>
Languages:
Java <form:radiobutton path="favouriteLanguage" value="Java"/>
C <form:radiobutton path="favouriteLanguage" value="C"/>
PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
<br><br>
Operating Systems:
Linux <form:checkbox path="operatingSystems" value="linux"/>
Windows <form:checkbox path="operatingSystems" value="windows"/>
Mac <form:checkbox path="operatingSystems" value="mac"/>

<input type="submit" value ="Submit"/>
</form:form>
</body>
</html>

