package com.hong.spring.ex.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxController {
	
	@GetMapping("/ajax/ex01")
	public String ex01() {
		return "ajax/ajax";
	}
}
