<%--
  Created by IntelliJ IDEA.
  User: TaiHao
  Date: 2020/12/2
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
	<base href="<%=basePath%>">
	<title>Title</title>
</head>
<body>
	<a href="test">注册</a>
</body>
</html>
