<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/12
  Time: 9:43 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><fmt:message key="welcomeinfo"></fmt:message></h1>
<form action="login" method="post">
    <fmt:message key="username"/><input type="text" name="name"/></br>
    <fmt:message key="password"/><input type="text" name="name"/></br>
    <input type="submit" value="<fmt:message key="submit"/>"/></br>
</form>
</body>
</html>
