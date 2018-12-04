<%--
  Created by IntelliJ IDEA.
  User: Wojtkowiak Jedrzej
  Date: 12/4/2018
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
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
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
