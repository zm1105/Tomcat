<%--
  Created by IntelliJ IDEA.
  User: 周敏
  Date: 2020/8/11
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>更新学生页面</title>

</head>


<body>

<h3>更新学生页面</h3>

<form method="post" action="UpdateServlet">
    <input type="hidden" name="sid" value="${stu.sid }">
    <table border="1" width="600">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" ></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input id="man" type="radio" checked="checked" name="1"/>男<input id="woman" type="radio" name="1"/>女
            </td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="email" name="email"></td>
        </tr>
        <tr>
            <td>生日</td>
            <td><input type="text" name="birthday"></td>
        </tr>

        <tr>
            <td>简介</td>
            <td><textarea name="info" rows="3" cols="20"></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="更新"></td>
        </tr>
    </table>
</form>
</body>
</html>