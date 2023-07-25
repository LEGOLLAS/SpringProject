package com.hong.spring.ex.jpa.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Student {
	private int id;
	private String name;
	private String major;
	private String numuber;
}
