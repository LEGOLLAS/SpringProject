package com.hong.spring.ex.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hong.spring.ex.jpa.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	//id를 기준으로 내림차순으로 정렬한 모든 행 데이터
	public List<Student> findAllByOrderByIdDesc();
	
	//id를 기준으로 내림차순 정렬 후 하나만 조회
	public List<Student> findTop1ByOrderByIdDesc();
	
	//name 컬럼이 일치하는 데이터 조회
	public List<Student> findByName(String name);
	
	//전달받은 이름들과 일치하는 모든 데이터 조회
	//name in ('홍지혁', '유제석', '조새휴')
	public List<Student> findByNameIn(List<String> nameList);
	
	//major 컬럼에 특정 문자열이 포함된 데이터 조회
	// major like "%naver%"
	public List<Student> findByMajorContaining(String major);
	
	//이름이 특정 문자열로 시작되는 데이터 조회
	//name like "홍%"
	public List<Student> findByNameStartingWith(String name);
	
	
	//id가 n에서 m사이에 대응되는 데이터 조회
	//between n and m
	public List<Student> findByIdBetweenOrderByIdDesc(int start, int end);
	
	//쿼리를 통해 특정 잘래희망을 가진 데이터 조회
	//네이티브 쿼리를 수행하는 어노테이션
	@Query(value="select * from `student` where `major` = :major", nativeQuery=true)
	public List<Student> findByMajorNative(@Param("major") String major);
}
