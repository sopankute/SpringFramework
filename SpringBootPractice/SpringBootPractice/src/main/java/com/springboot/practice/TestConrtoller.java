package com.springboot.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestConrtoller {
	
	@RequestMapping("/test")
	public String firstHandler() {
		return "this is my first spring boot Application.";
	}
}
