package com.hong.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hong.spring.ex.database.domain.UsedGoods;
import com.hong.spring.ex.database.service.UsedGoodService;

//only operated that request and response functional
@Controller
public class UsedGoodController {
	
	@Autowired
	private UsedGoodService useGoodService;
	
	//get used_goods list
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	//행을 저장하기 위해서 list 안에 entity를 넣는다
	public List<UsedGoods> getUsedGoodsList(){
		List<UsedGoods> usedGoodList = useGoodService.getUsedGoodList();
		
		return usedGoodList;
	}
	
}
