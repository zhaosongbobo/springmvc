<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/11
  Time: 3:23 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    request.setAttribute("ctp", request.getContextPath());
%>
<body>
<form action="${ctp}/testDateFormat">
    id:<input type="text" name="id"/><br>
    name:<input type="text" name="name"/><br>
    password:<input type="text" name="password"/><br>
    age:<input type="text" name="age"/><br>
    date:<input type="text" name="birth"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
