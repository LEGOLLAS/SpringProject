package com.hong.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.spring.ex.jpa.domain.Student;
import com.hong.spring.ex.jpa.repository.StudentRepository;
import com.hong.spring.ex.jpa.service.StudentService;

@Controller
public class JpaStudentController {
	
	@Autowired
	private StudentService studentService;
	private StudentRepository studentRepository;
	
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
	
	@GetMapping("/jpa/student/select")
	public List<Student> selectFindAll() {
		//List<Student> list = studentRepository.findTop1ByOrderByIdDesc();
		
		//전달받은 이름을 가진 모든 데이터 조회
		List<String> nameList = new ArrayList<>();
		nameList.add("홍지혁");
		nameList.add("조세휴");
		List<Student> list = studentRepository.findByNameIn(nameList);
		return list;
	}
	
	@GetMapping("/jpa/student/native")
	@ResponseBody
	public List<Student> nativeStudent(){
		//장래희망이 변호사인 데이터 조회
		List<Student> list = studentRepository.findByMajorNative("변호사");
		
		return list;
	}
}
