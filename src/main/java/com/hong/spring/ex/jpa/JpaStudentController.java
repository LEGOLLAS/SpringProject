package com.hong.spring.ex.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.spring.ex.jpa.domain.Student;
import com.hong.spring.ex.jpa.service.StudentService;

@Controller
public class JpaStudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/lombok/test")
	@ResponseBody
	public void test() {
		//builder 패턴
		Student student = Student.builder()
				.name("홍지혁")
				.major("engineer")
				.numuber("010-6666-6666")
				.build();

		System.out.println(student);
		
	}
	
	
	@GetMapping("/jpa/student/create")
	@ResponseBody
	public Student createStudent() {
		String name = "홍지혁";
		String phoneNumber = "010-6666-7777";
		String major = "engineer";
		
		return studentService.addStudent(name, major, phoneNumber);
	}
	
	
	@GetMapping("/jpa/student/update")
	@ResponseBody
	public Student updateStudent() {
		//id =1 인 데이
		Student student = studentService.updateStudentMajor(1, "개발자2");
		
		return student;
	}
	
	
	@GetMapping("/jpa/student/delete")
	@ResponseBody
	public String deleteStudent() {
		studentService.deleteStudent(1);
		
		return "삭제성공";
	}
}
