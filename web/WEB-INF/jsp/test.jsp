<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <head>
        <title>请登录</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- 引入 Bootstrap -->
        <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>
</head>

<body>
<div >
    <form method="post" action="${pageContext.request.contextPath}/book/test">
        用户名：<input type="text" name="username"><br>
        密码：<br><input type="text" name="pwd"><br>
        <input type="submit" value="登录">
    </form>
</div>

</body>
</html>
