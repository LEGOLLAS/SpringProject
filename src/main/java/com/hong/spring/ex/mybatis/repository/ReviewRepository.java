package com.hong.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hong.spring.ex.mybatis.domain.Review;

@Repository
public interface ReviewRepository {
	//메소드에 대한 쿼리수행 -> xml
	public Review selectReview(@Param("id") int id);
}
