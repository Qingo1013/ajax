<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/3/28
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ajax</title>

    <%--JQuery不是框架，是java script的库，里面写好了函数为我们调用--%>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <%--<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.1.1/jquery.min.js"></script>--%>
    <script>
      function a1() {
        <%--这里$和JQuery作用相同--%>
        $.post({
          //请求
          url:"${pageContext.request.contextPath}/a1",
          //数据：必须以键值对的形式
          data:{'name':$("#username").val()},
          success:function (data,status) {
            alert(data);
            console.log("data="+data);
            console.log("status="+data);
          }, error:function () {

          }
        });
      }

    </script>

  </head>
  <body>
    <%--失去焦点时，发送一个请求（携带信息）到后台--%>
    用户名：<input type="text" id="username" onblur="a1()">
  </body>
</html>
