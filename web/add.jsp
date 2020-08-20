<%--
  Created by IntelliJ IDEA.
  User: 周敏
  Date: 2020/8/11
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加学生</title>
</head>
<body>

<h3>添加学生页面</h3>

<form method="post" action="Add">
    <table border="1" width="600">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>

                <input type="radio" name="gender" value="0">男
                <input type="radio" name="gender" value="1">女
            </td>
        </tr>
        <tr>
            <td>生日</td>
            <td><input type="text" name="birthday"></td>
        </tr>
       <tr>
           <td>邮箱</td>
           <td><input type="email" name="email" ></td>
       </tr>
        <tr>
            <td>简介</td>
            <td><textarea name="remarks" rows="3" cols="20"></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
<%--<h3><a href="StudentListServlet">显示所有学生列表</a></h3><br>--%>
<%--<h3><a href="StudentListPageServlet?currentPage=1">分页显示所有学生</a></h3>--%>
</body>

</html>
