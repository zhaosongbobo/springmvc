<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/12
  Time: 8:39 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctp}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/></br>
    <input type="file" name="file"/></br>
    <input type="file" name="file"/></br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
