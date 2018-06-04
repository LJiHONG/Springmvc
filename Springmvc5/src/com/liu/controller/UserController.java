package com.liu.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	/*返回数据的方法*/
	
	@RequestMapping("/add1.do")
	public String add(HttpServletRequest request){
		String userNum=request.getParameter("userNum");
		String pwd=request.getParameter("pwd");
		System.out.println("userNum:"+userNum+"pwd:"+pwd);
		String str="userNum:"+userNum+"pwd:"+pwd;
		request.setAttribute("str",str);
		return "user_add1";
	}
	
	@RequestMapping("/add2.do")
	public ModelAndView add2(){
		ModelAndView mav=new ModelAndView("user_add2");//要返回的页面
		mav.addObject("userId", 1001);//返回的数据
		mav.addObject("username", "张三");//返回的数据
		return mav;
	}
	
	@RequestMapping("/add3.do")
	public String add3(Model model){
		model.addAttribute("id",1002);
		model.addAttribute("name","王五");
		return "user_add3";
	}
	
	@RequestMapping("/add4.do")
	public String add4(Map map){
		map.put("id",1002);
		map.put("name","王五");
		return "user_add4";
	}
}
