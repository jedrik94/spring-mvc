<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
Customer confirmed.
<br>
Hello customer ${customer.firstName} ${customer.lastName}!
<br>
You have ${customer.numberOfChildren} children, cool.
<br>
Postal code: ${customer.postalCode}
<br>
Old School Runescape Name: ${customer.oldSchoolRunescapeName}
</body>
</html>
