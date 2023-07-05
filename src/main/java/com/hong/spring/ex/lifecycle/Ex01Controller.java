package com.hong.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	@RequestMapping("/lifecycle/ex01/1")
	@ResponseBody //return을 body담아서 내려준다. 
	public String stringResponse() {
		return "<h1>example1</h1>";
	}
	
	@RequestMapping("/lifecycle/ex01/2")
	@ResponseBody
	public Map<String, Integer> mapResponse(){
		//과일 이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("apple", 500);
		fruitMap.put("banana", 800);
		fruitMap.put("orange", 600);
		fruitMap.put("peach", 900);
		
		return fruitMap;
	}
}
