package com.hong.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody 어노테이션
@RequestMapping("/lifecycle/ex01") //Mapping url 통일 가능
public class Ex01RestController {
	
	//객체 리턴
	@RequestMapping("/3")
	public Person objectResponse() {
		Person person = new Person("홍지혁", 28);
		
		//response는 문자열이다!!!!!
		return person;
	}
	
	
	//status 코드를 포함한 response
	//200 ok
	//404, 400, 500
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse(){
		Person person = new Person("홍지혁", 29);
		
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
}
