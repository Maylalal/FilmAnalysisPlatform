<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/30
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
  <form action="/login" method="post">
      电影名：<input type="text" name="name">
      导演：<input type="text" name="director">
      <input type="submit" value="登陆">
  </form>
</body>
</html>
