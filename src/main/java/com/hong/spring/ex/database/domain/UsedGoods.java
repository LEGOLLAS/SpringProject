package com.hong.spring.ex.database.domain;

import java.util.Date;

//used_goods 테이블의 컬럼이름과 일치하는 멤버변수를 가진 클래스
//Entity, Domain
public class UsedGoods {
	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String description;
	private String image;
	private Date createdAt;
	private Date updatedAt;
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getsellerId() {
		return sellerId;
	}
	
	public void setsellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
	public String gettitle() {
		return title;
	}
	
	public void settitle(String title) {
		this.title = title;
	}
	
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	public String getdescription() {
		return description;
	}
	
	public void setdescription(String description) {
		this.description = description;
	}
	
	public String getimage() {
		return image;
	}
	
	public void setimage(String image) {
		this.image = image;
	}
	
	public Date getcreatedAt() {
		return createdAt;
	}
	
	public void setcreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Date getupdatedAt() {
		return updatedAt;
	}
	
	public void setupdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
