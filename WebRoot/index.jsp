<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

  <base href="<%=basePath%>">
    <!--Site Title-->
    <title>index for system</title>

    <!-- Meta Date-->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="keywords" content="photography, senior pictures">
    <meta http-equiv="description" content="the description of system.">
    <meta http-equiv="author" content="CYL">
    <meta http-equiv="copyright" content="Copyright CYL">
    <meta http-equiv="robots" content="follow, index">

    <!--Stte Theme Styling-->
    <link rel="stylesheet" href="style/reset.css" />
    <link rel="stylesheet" href="style/global.css" />
    <link rel="stylesheet" href="style/layout.css" />

    <!--[if lt IE 9]>
    <script type="text/javascript" src="javascript/HTML5-Shiv.js"></script>
    <![endif] -->
</head>
<body>

    <!--实验预约系统顶上部分和登录注册模块-->
    <div id="all">
    
    <div id="header">
        <div class="container">
				<form action="src/com.cyl.action/loginAction.action"class="login">
    			<input type="username" name="userName" class="login-input1" placeholder="用户名" >
    			<input type="password" name="userPassword" class="login-input2" placeholder="密码">
    			<input type="submit" value="登录" class="login-submit">
   				 <a href="enroll.jsp" class="enroll-submit">注册</a>

 				 </form>
          
        </div>

    </div>
    
  
</div>
</body>
</html>