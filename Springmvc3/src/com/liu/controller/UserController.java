package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/list.do")
	public String list(){
		System.out.println("----------��ѯ�û���Ϣ---------");
		return "user_list";
	}
	
	@RequestMapping("/add.do")
	public String add(){
		System.out.println("----------�û���Ϣ���---------");
		return "user_add";
	}
	
	@RequestMapping("/update.do")
	public String update(){
		System.out.println("----------�û���Ϣ�޸�---------");
		return "user_update";
	}
}
