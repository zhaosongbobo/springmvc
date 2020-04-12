<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/12
  Time: 6:18 下午
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
    <form action="${ctp}/testRequestBody" method="post" enctype="multipart/form-data">
        <input type="text" name="name"/></br>
        <input type="text" name="age"/></br>
        <input type="file" name="file"/></br>
        <input type="submit" value="提交">
    </form>

    <hr/>
    <a href="${ctp}/testRequestBodyJson">发送json数据</a>
    <script type="text/javascript">
        $("a:first").click(function () {
            var user = {id:"1",name:"zhangsan",age:"12",gender:"男",birth:"2020-3-13",email:"123@qq.com"};
            var userJson = JSON.stringify(user);
            $.ajax({
                url:"${ctp}/testRequestBodyJson",
                type:"POST",
                data:userJson,
                contentType:"application/json",
                success:function (data) {
                    alert(data);
                }
            });
            return false;
        });
    </script>
</body>
</html>
