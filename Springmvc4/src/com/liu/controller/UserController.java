package com.liu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liu.po.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	/*获取请求参数的方法*/
	
	@RequestMapping("/add1.do")
	public String add(HttpServletRequest request){
		String userNum=request.getParameter("userNum");
		String pwd=request.getParameter("pwd");
		System.out.println("userNum:"+userNum+"pwd:"+pwd);
		return "user_add1";
	}
	
	//设置参数来获取
	@RequestMapping("/add2.do")
	public String add(String userNum,String pwd){
		System.out.println("userNum:"+userNum+"pwd:"+pwd);
		return "user_add1";
	}
	
	@RequestMapping("/add3.do")
	public String add3(@RequestParam(value="userNum")String number,String pwd){
		System.out.println("userNum:"+number+"pwd:"+pwd);
		return "user_add1";
	}
	
	@RequestMapping("/add4.do")
	public String add4(UserInfo user){
		System.out.println(user);
		return "user_add1";
	}
	
	@RequestMapping("/add5.do")
	public String add5(Integer userID,Date userTime){
		System.out.println(userID);
		System.out.println(userTime);
		return "user_add1";
	}
	
	//时间属性编辑器
	@InitBinder
	public void initBinder(ServletRequestDataBinder bin){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor cust=new CustomDateEditor(sdf, true);
		bin.registerCustomEditor(Date.class, cust);
	}
}
