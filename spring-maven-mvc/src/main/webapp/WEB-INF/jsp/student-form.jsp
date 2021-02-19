<%--
  Created by IntelliJ IDEA.
  User: alexander
  Date: 07-Feb-21
  Time: 08:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName"></form:input>
        <br><br>
        Last name: <form:input path="lastName"></form:input>
        <br><br>
    </form:form>
</body>
</html>
