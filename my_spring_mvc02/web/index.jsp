<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/9
  Time: 10:09 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <%request.setAttribute("ctp",request.getContextPath());%>
  </head>
  <body>
  <form action="${ctp}/testModelAttribute">
    id:<input type="text" name="id"/><br>
    name:张三<br>
    password:<input type="text" name="password"/><br>
    age:<input type="text" name="age"/><br>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
