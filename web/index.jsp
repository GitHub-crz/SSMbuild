<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
</h3>

<div >
    <form method="post" action="${pageContext.request.contextPath}/test">
        用户名：<input type="text" name="username"><br>
        密码：<input type="text" name="pwd"><br>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>