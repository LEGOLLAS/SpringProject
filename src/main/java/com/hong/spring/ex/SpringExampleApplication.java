package com.hong.spring.ex;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//application.properties에 디비 세팅해서 해당 어노테이션 제외가능 
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}
}
