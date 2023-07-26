package com.hong.spring.ex.jpa.domain;

import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//테이블 설정
@Table(name="student")
//엔티티 지정
@Entity
@Getter
@Setter
@Builder(toBuilder=true)
@ToString
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//카멜케이스에 코드랑 스네이크 코드에 디비 컬럼이랑 매칭하기 위해서는
	//@Column(name="") 어노테이션을 위에 써준다.
	private String name;
	private String major;
	private String numuber;
	
	@UpdateTimestamp
	//update 되지 않도록 설정
	@Column(name="createdAt", updatable=false)
	//타임존을 같이 사용할 수 있는 라이브러리 => ZonedDateTime
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private ZonedDateTime updatedAt;
	
}
