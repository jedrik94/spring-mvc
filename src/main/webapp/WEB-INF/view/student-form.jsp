<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
    First name:
    <form:input path="firstName"/>
    <br>
    Last name:
    <form:input path="lastName"/>
    <br>
    Country:
    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>
    <br>
    Fav programming language:
    <form:radiobuttons path="favouriteProgrammingLanguage" items="${programmingLanguages}"/>
    <br>
    Owned pets:
    <form:checkboxes path="ownedPets" items="${pets}"/>
    <br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
