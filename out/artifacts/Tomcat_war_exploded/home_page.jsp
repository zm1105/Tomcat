<%--
  Created by IntelliJ IDEA.
  User: 周敏
  Date: 2020/8/11
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理</title>
</head>
<body>
<form action="Search" method="post">
    <table border="1" width="700">

        <tr >
            <td colspan="8">

                按姓名查询:<input type="text" name="sname"/>
                &nbsp;
                按性别查询:<select name="sgender">
                <option value="">--请选择--
                <option value="男">男
                <option value="女">女
            </select>
                &nbsp;&nbsp;&nbsp;
                <input type="submit" value="查询">
                &nbsp;&nbsp;&nbsp;
                <a href="add.jsp">添加</a>
            </td>
        </tr>

        <tr align="center">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>邮箱</td>
            <td>生日</td>
            <td>简介</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${list }" var="stu">
            <tr align="center">
                <td>${stu.id }</td>
                <td>${stu.username }</td>
                <td>${stu.gender }</td>
                <td>${stu.email }</td>
                <td>${stu.birthday }</td>
                <td>${stu.remarks }</td>
                <td><a href="EditServlet?sid=${stu.sid }">更新</a>   <a href="#" onclick="doDelete(${stu.sid})">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>



