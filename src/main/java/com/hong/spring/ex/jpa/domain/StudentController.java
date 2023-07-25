package com.hong.spring.ex.jpa.domain;

import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
	
	public void test() {
		//builder 패턴
		Student student = Student.builder()
				.name("홍지혁")
				.numuber("010-6666-6666")
				.build();
	}
}
