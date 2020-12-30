<%--
  Created by IntelliJ IDEA.
  User: 46687
  Date: 2020/12/28
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>name</td>
        <td>age</td>
        <td>address</td>
        <td>操作</td>
    </tr>
    <c:forEach var="p" items="${list}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.loginPwd}</td>
            <td>${p.loginAct}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
