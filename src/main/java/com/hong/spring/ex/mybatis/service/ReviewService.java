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
	
	public int addReview(
			int storeId, 
			String menu, 
			String userName,
			double point, 
			String review
			) {
		return reviewRepository.insertReview(storeId, menu, userName, point, review);
	}
	
	
	//객체로 전달된 데이터 저장
	public int addReviewByObject(Review review) {
		int count = reviewRepository.insertReviewByObject(review);
		return count;
	}
	
}
