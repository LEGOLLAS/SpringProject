package com.hong.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hong.spring.ex.mybatis.domain.Review;
import com.hong.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	public Review getReview(int id) {
		Review reviewData = reviewRepository.selectReview(id);
		return reviewData;
	}
	
}
