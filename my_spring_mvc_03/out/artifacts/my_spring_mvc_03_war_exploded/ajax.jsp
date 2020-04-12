<%--
  Created by IntelliJ IDEA.
  User: zhaosongbo
  Date: 2020/4/12
  Time: 5:52 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="script/jquery-1.9.1.min.js"></script>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<%=new Date()%>
<a href="${ctp}/testJsonData">获取用户信息</a>
<div>

</div>
<script type="text/javascript">
    $("a:first").click(function () {
        $.ajax({
            url:"${ctp}/testJsonData",
            type:"GET",
            success:function (data) {
                console.log(data)
                $.each(data,function() {
                    var user = this.id+"--"+this.name+"--"+this.age+"--"+this.gender+"--"+this.birth+"--"+this.email;
                    $("div").append(user+'<br/>');
                })
            }
        });
        return false;
    });
</script>
</body>
</html>
