<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/12
  Time: 11:18 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${ctp}/testValidate" method="post" modelAttribute="user">
    编号：<form:input path="id"></form:input> <form:errors path="id"></form:errors><br>
    姓名：<form:input path="name"></form:input> <form:errors path="name"></form:errors><br>
    年龄：<form:input path="age"></form:input> <form:errors path="age"></form:errors><br>
    性别：<form:input path="gender"></form:input> <form:errors path="gender"></form:errors><br>
    日期：<form:input path="birth"></form:input> <form:errors path="birth"></form:errors><br>
    邮箱：<form:input path="email"></form:input> <form:errors path="email"></form:errors><br>
    <input type="submit" value="提交">
</form:form>
</body>
</html>
