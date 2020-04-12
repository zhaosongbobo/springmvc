<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/11
  Time: 1:01 下午
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

<form action="${ctp}/testValidate" method="post">
    编号：<input type="text" name="id"><br>
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    性别：<input type="text" name="gender"><br>
    日期：<input type="text" name="birth"><br>
    邮箱：<input type="text" name="email"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
