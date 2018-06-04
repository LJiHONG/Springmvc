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
	
	/*�������ݵķ���*/
	
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
		ModelAndView mav=new ModelAndView("user_add2");//Ҫ���ص�ҳ��
		mav.addObject("userId", 1001);//���ص�����
		mav.addObject("username", "����");//���ص�����
		return mav;
	}
	
	@RequestMapping("/add3.do")
	public String add3(Model model){
		model.addAttribute("id",1002);
		model.addAttribute("name","����");
		return "user_add3";
	}
	
	@RequestMapping("/add4.do")
	public String add4(Map map){
		map.put("id",1002);
		map.put("name","����");
		return "user_add4";
	}
}
