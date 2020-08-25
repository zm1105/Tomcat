<%@ page import="com.student.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 周敏
  Date: 2020/8/12
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部信息</title>
</head>
<body>

<form action="Search" method="post">
    <table border="1" width="700">

        <tr>
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

        <td><% List<User> ul = (List<User>) session.getAttribute("userList");
                for (User d : ul) { %>
            <tr align="center">
                <td><%=d.getId()%>
                </td>
                <td><%= d.getUsername()%>
                </td>
                <td><%=d.getGender()%>
                </td>
                <td><%=d.getEmail()%>
                </td>
                <td><%=d.getBirthday()%>
                </td>
                <td><%=d.getRemarks()%>
                </td>
                <td><a href="edit.jsp">修改</a>
                <%
                    }
                %>

                </td>

            </tr>
    </table>
</form>
</body>
</html>