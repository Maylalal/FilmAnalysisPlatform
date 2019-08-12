<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="/findByArea" method="post">
    <input type="text" name="area"/>
    <input type="submit" value="查看"/>
</form>

<form action="/calActor" method="post">
    <input type="submit" value="计算actor的权值">
</form>
<form action="/calDirector" method="post">
    <input type="submit" value="计算director的权值">
</form>
<table>
    <c:forEach items="${movieList}" var="movie">
        ${movie.movieName}
        ${movie.movieDirector}
        ${movie.movieActor}
    </c:forEach>
</table>
<form action="/addSolr" method="post">
  <input type="submit" value="添加到solr中">
</form>

<form action="/search" method="post">
    <input type="text" name="args">
    <input type="submit" value="测试">
</form>

<form action="/addData" method="post">
    <input type="submit" value="添加到数据库">
</form>


<form action="/forecastBox" method="post">
    导演：<input type="text" name="director">
    演员1：<input type="text" name="actor1">
    演员2：<input type="text" name="actor2">
    演员3：<input type="text" name="actor3">
    演员4：<input type="text" name="actor4">
    <input type="submit" value="预测票房">
</form>

</body>
</html>
