package com.hong.spring.ex.jstl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSTLController {
	@GetMapping("/jstl/ex01")
	public String ex01() {
		return "jstl/ex01";
	}
	
	@GetMapping("/jstl/ex02")
	//jsp로 생성한 데이터를 넘겨주고 싶을때는 model을 생성해준다. 
	public String ex02(Model model) {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("바나나");
		fruitList.add("포도");
		fruitList.add("배");
		
		model.addAttribute("fruitList", fruitList);
		
		return "jstl/ex02";
	}
	
	@GetMapping("/jstl/ex03")
	public String ex03(Model model) {
		
		Date date = new Date();
		
		model.addAttribute("now", date);
		
		String dateString = "2023/07/14 20:53:12";
		model.addAttribute("dateString", dateString);
		
		return "jstl/ex03";
	}
}
