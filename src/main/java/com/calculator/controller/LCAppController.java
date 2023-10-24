package com.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calculator.dto.UserInfoDTO;


@Controller
public class LCAppController {

	@RequestMapping("/love")
	public String welcome(UserInfoDTO user, Model model) {
		// To load default value
		UserInfoDTO dto = new UserInfoDTO();
		model.addAttribute("userInfo", dto);
		return "welcome";
	}
	
	
	@RequestMapping("/process")
	public String process(UserInfoDTO user , Model model) {
		System.out.println(user.toString());
		model.addAttribute("userInfo", user);
		return "process";
	}
	
	
	@RequestMapping("/love-modelAttribute")
	public String welcome(@ModelAttribute("userInfo")UserInfoDTO user) {
		
		return "welcome";
	}
	
	
	@RequestMapping("/process-modelAttribute")
	public String process(@ModelAttribute("userInfo")UserInfoDTO user) {
		System.out.println(user.toString());
		
		return "process";
	}
	
	
}
