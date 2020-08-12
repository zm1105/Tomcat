<%--
  Created by IntelliJ IDEA.
  User: 周敏
  Date: 2019/7/24
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<form action="Login" method="post">
    <table border="1" align="center" width="500">
        <tr>
            <td><label for="username">用户名</label></td>
            <td><input type="text" name="username" id="username"></td>
        </tr>
        <tr>
            <td><label for="password">密码</label></td>
            <td><input type="password" name="password" id="password"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="注册">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

