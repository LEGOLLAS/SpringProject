package com.hong.spring.ex.lifecycle;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//객체를 설명하는 메소드
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age;  
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
