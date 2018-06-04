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
  	<!-- 使用超链接访问时只支持get方式，使用form表单时支持get和post -->
   <a href="user/list.do">查询</a>
   <a href="user/add.do">添加</a>
   <a href="user/update.do">修改</a>
   <form action="user/list.do" method="post"><input type="submit" value="提交"/></form>
  </body>
</html>
