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
   <!-- 表单的name属性必须和类的属性名称一致 -->
   <form action="user/add4.do" method="post">
   		编号：<input type="text" name="userID"/><br/>
   		姓名：<input type="text" name="userName"/><br/>
   		性别：<input type="text" name="userSex"/><br/>
   		兴趣爱好
   		<!-- 同时传递多个参数 -->
   		<input type="checkbox" name="userxq" value="LOL">LOL
   		<input type="checkbox" name="userxq" value="英雄联盟">英雄联盟
   		<input type="checkbox" name="userxq" value="DOTA">DOTA
   		<input type="submit" value="提交">
   </form>
  </body>
</html>
