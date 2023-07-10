package com.hong.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.spring.ex.mybatis.domain.Review;
import com.hong.spring.ex.mybatis.service.ReviewService;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	
	//리뷰테이블에서 id=1 데이터조회
	@RequestMapping("/ex01")
	@ResponseBody
	public Review getReview(@RequestParam("id") int id) {
		Review review = reviewService.getReview(id);
		return review;
	}
	
	
	@RequestMapping("/ex02")
	@ResponseBody
	//새로운 리뷰를 등록하는 기능 
	public String createReview() {
		//4, 콤비네이션 피자, 김인규, 4.5, 할인도 많이 받고 잘 먹었어요.
		//int count = reviewService.addReview(4, "콤비네이션 피자", "김인규", 4.5, "할인도 많이 받고 잘 먹었어요.");
		
		
		//2, 뿌링클, 김인규, 4.0, 역시 뿌링클은 진리입니다.
		
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("홍지혁");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리입니다.");
		
		int count = reviewService.addReviewByObject(review);
		
		return "삽입 개수 : " + count;
	}
}
