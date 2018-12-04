<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

The student is confirmed: ${student.lastName} ${student.firstName}
<br>
Country: ${student.country}
<br>
Language: ${student.favouriteProgrammingLanguage}
<br>
Owned pets:
<ul>
    <c:forEach var="tmp" items="${student.ownedPets}">
        <li>${tmp}</li>
    </c:forEach>
</ul>


</body>
</html>
