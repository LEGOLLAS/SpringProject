package com.hong.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex02")
	public String jspPage(){
		
		//처음에 에러 발생
		//jsp 연동 세팅을 해야함 => gradle
		return "lifecycle/ex02";
	}
}
