<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html> 
<head>
<title> Customer Registration Form</title>
</head>

<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}<br><br>
PostalCode: ${customer.postalCode}  <br><br>
Number of Passes booked:  ${customer.freePasses} <br><br>
Course:  ${customer.courseCode}
<br><br>
</body>
</html>