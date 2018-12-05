<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Form</title>

    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
    First Name:
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    Last Name:
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
