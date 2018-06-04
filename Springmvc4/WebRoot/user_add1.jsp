<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <h1>添加用户信息</h1>
   <form action="user/add1.do" method="post">
   		账号：<input type="text" name="userNum"/><br/>
   		密码：<input type="text" name="pwd"/><br/>
   		<input type="submit" value="提交">
   </form>
   
   <form action="user/add2.do" method="post">
   		账号：<input type="text" name="userNum"/><br/>
   		密码：<input type="text" name="pwd"/><br/>
   		<input type="submit" value="提交">
   </form>
   
   <form action="user/add3.do" method="post">
   		账号：<input type="text" name="userNum"/><br/>
   		密码：<input type="text" name="pwd"/><br/>
   		<input type="submit" value="提交">
   </form>
  </body>
</html>
