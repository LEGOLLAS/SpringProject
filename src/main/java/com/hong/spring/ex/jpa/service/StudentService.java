package com.hong.spring.ex.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.spring.ex.jpa.domain.Student;
import com.hong.spring.ex.jpa.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public Student addStudent(String name, String major, String phoneNumber) {
		
		Student student = Student.builder()
				.name(name)
				.major(major)
				.numuber(phoneNumber)
				.build();		
		
		return studentRepository.save(student);		
	}
	
	public Student updateStudentMajor(int id, String major){
		//업데이트 대상이 되는 행을 조회한다.
		//조회된 객체에서 필요한 멤버변수를 수정한다. 
		//해당 객체를 저장한다. 
		
		//Optional<Student> 객체가 리턴됨
		//null일 수도 있는 객체를 리턴할때 사용하는 클래스
		Optional<Student> optionalStudent = studentRepository.findById(id);
		Student student = optionalStudent.orElse(null);
		
		if(student != null) {
			
			student = student.toBuilder().major(major).build();
			student = studentRepository.save(student);
		}
		
		return student;
	}
	
	public void deleteStudent(int id) {
		//삭제 대상 객체를 워함, 객체를 기반으로 삭제 
//		Student student = studentRepository.findById(id).orElse(null);
//		
//		if(student != null) {
//			studentRepository.delete(student);
//		}
		
		
		//좀더 멋잇게 삭제하는 방법
		Optional<Student> optionalStudent = studentRepository.findById(id);
		//람다식 
		optionalStudent.ifPresent(student -> studentRepository.delete(student));
	}
}
