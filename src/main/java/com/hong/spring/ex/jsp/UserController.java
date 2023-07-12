package com.hong.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.spring.ex.jsp.domain.User;
import com.hong.spring.ex.jsp.service.UserService;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//메소드에 대한 정의도 필요
	//@RequestMapping(path="/jsp/user/add", method=RequestMethod.POST)
	//@GetMapping("/")
	@PostMapping("/add")
	//@ResponseBody
	public String createUser(
			@RequestParam("name") String name,
			@RequestParam("birthday") String birthday,
			@RequestParam("email") String email,
			@RequestParam("introduce") String introduce,
			Model model
			) {
		//int count = userService.addUser(name, birthday, email, introduce);
		
		//insert한 ID값을 바로 select하기
		User user = new User();
		user.setName(name);
		user.setYyyymmdd(birthday);
		user.setEmail(email);
		user.setIntroduce(introduce);
		
		int count = userService.addUserByObject(user);
		
		//모델을 먼저 세팅하기
		//재사용하는 result key로 user 객체를 전달해준다.
		model.addAttribute("result", user);
		//return "입력 성공 : " + count;
		return "jsp/userInfo";
	}
	
	
	//userInput 페이지 보여주기
	@GetMapping("/input")
	public String userInput() {
		return "jsp/userInput";
	}
	
	
	//가장 최근에 등록된 사용자 정보 조회
	//jsp는 경로로 보여줄꺼라서 리턴타입은 문자열!!!!!!!!!
	@GetMapping("/last/user")
	public String lastUser(Model model) {
		User user = userService.selectLastUser();
		
		//모델객체 안에 데이터를 추가
		//model은 컨트롤러에서만 사용가능
		model.addAttribute("result", user);
		
		return "jsp/userInfo";
	}
}


















