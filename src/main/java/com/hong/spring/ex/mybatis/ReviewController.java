package com.hong.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.spring.ex.mybatis.domain.Review;
import com.hong.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	
	//리뷰테이블에서 id=1 데이터조회
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review getReview(@RequestParam("id") int id) {
		Review review = reviewService.getReview(id);
		return review;
	}
}
