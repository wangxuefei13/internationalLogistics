<%--
  Created by IntelliJ IDEA.
  User: llh
  Date: 2021/1/5
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">

    <title>注册</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
    <!-- Google Chrome Frame也可以让IE用上Chrome的引擎: -->
    <meta name="renderer" content="webkit">
    <!--国产浏览器高速模式-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="穷在闹市" />
    <!-- 作者 -->
    <meta name="revised" content="穷在闹市.v3, 2019/05/01" />
    <!-- 定义页面的最新版本 -->
    <meta name="description" content="网站简介" />
    <!-- 网站简介 -->
    <meta name="keywords" content="搜索关键字，以半角英文逗号隔开" />
    <title>国际物流有限公司</title>
    <!-- 公共样式 开始 -->
    <link rel="shortcut icon" href="images/favicon.ico"/>
    <link rel="bookmark" href="images/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="css/base.css">
    <link rel="stylesheet" type="text/css" href="css/iconfont.css">
    <script type="text/javascript" src="framework/jquery-1.11.3.min.js" ></script>
    <link rel="stylesheet" type="text/css" href="layui1/css/layui.css">
    <!--[if lt IE 9]>
    <script src="framework/html5shiv.min.js"></script>
    <script src="framework/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="layui1/layui.js"></script>
    <!-- 滚动条插件 -->
    <link rel="stylesheet" type="text/css" href="css/jquery.mCustomScrollbar.css">
    <script src="framework/jquery-ui-1.10.4.min.js"></script>
    <script src="framework/jquery.mousewheel.min.js"></script>
    <script src="framework/jquery.mCustomScrollbar.min.js"></script>
    <script src="framework/cframe.js"></script><!-- 仅供所有子页面使用 -->
    <!-- 公共样式 结束 -->

    <link rel="stylesheet" type="text/css" href="css/login.css">
    <script type="text/javascript" src="js/login.js"></script>
    <style type="text/css">
        .layui-form-item {
            margin-bottom: 0px;
            clear: both;
            margin-left: -50px;
            *zoom: 1;
        }
        .login_main .logo {
            margin-top: 20px;
        }
        .layui-input-block {
            margin-left: 50px;
            min-height: 36px;
        }
        .select{
            margin-bottom: 20px;
        }
        .title{
            margin-bottom: 20px !important;
        }
    </style>
</head>
<body>
<!--主体 开始-->
<div class="login_main">
    <!--轮播图 开始-->
    <div class="layui-carousel lbt" id="loginLbt">
        <div carousel-item>
            <div class="item" style="background: url(images/login_bg1.jpg) no-repeat; background-size: cover;"></div>
            <div class="item" style="background: url(images/login_bg2.jpg) no-repeat; background-size: cover;"></div>
        </div>
    </div>
    <!--轮播图 结束-->
    <div class="logo">
        <img src="images/login_logo.png" />
        <div>
            <h1>国际物流有限公司</h1>
            <p>版本号:19.3.01</p>
        </div>
    </div>
    <div class="form_tzgg">
        <div class="form">
            <form action="register" method="post" class="layui-form">
                <div class="title">用户注册</div>
                <div class="con">
                    <input type="text" name="userName" lay-verify="userName" placeholder="请输入您的用户名" autocomplete="off" class="layui-input">
                </div>
                <div class="con">
                    <input type="password" name="userPassword" required  lay-verify="passWord" placeholder="请输入您的密码" autocomplete="off" class="layui-input">
                </div>
                <div class="con">
                    <input type="password" name="userPassword1" required  lay-verify="passWord1" placeholder="请确认您的密码" autocomplete="off" class="layui-input">
                </div>
                <div class="select layui-form-item">
                    <div class="layui-input-block">
                        <select name="companyId" lay-verify="required">
                            <option value="">请选择您的公司</option>
                            <option value="1">地方子公司</option>
                            <option value="2">箱管子公司</option>
                            <option value="3">运营子公司</option>
                            <option value="4">境外代理</option>
                        </select>
                    </div>
                </div>
                <div class="con">
                    <input type="text" name="email" required  lay-verify="email" placeholder="请输入您的邮箱" autocomplete="off" class="layui-input">
                </div>
                <div class="con">
                    <input type="text" name="userPhoneNum" required  lay-verify="phone" placeholder="请输入您的手机号码" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <div class="layui-form-label">性别</div>
                    <div class="layui-input-block">
                        <input class="radio" type="radio" name="gender" value="0" title="男" checked>
                        <input type="radio" name="gender" value="1" title="女">
                    </div>
                </div>
                <div class="but">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">确认注册</button>
                </div>
                <div class="apply"><a href="login1.html">去登陆</a></div>
            </form>
        </div>
        <script>
            layui.use('form', function() {
                var form = layui.form;
                var pass;
                form.verify({
                    userName: function(value, item){ //value：表单的值、item：表单的DOM对象
                        if(value == null || value == ""){
                            return '请输入您的用户名！';
                        }
                    },
                    passWord: function(value, item){
                        if(value == null || value == ""){
                            return '请输入您的账户密码！';
                        }
                        pass = value;
                    },
                    passWord1: function(value, item){
                        if(value == null || value == ""){
                            return '请确认密码！';
                        }else if(pass != value){
                            return "两次输入密码不一致";
                        }
                    }
                });
                //监听提交
                form.on('submit(formDemo)', function(data) {
                    return true;
                });
            });
        </script>
    </div>
</div>
<!--主体 结束-->
</body>
</html>
