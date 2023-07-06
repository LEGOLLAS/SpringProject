package com.hong.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.spring.ex.database.domain.UsedGoods;
import com.hong.spring.ex.database.repository.UsedGoodRepository;

//operate for logic of business
@Service
public class UsedGoodService {
	
	@Autowired //스프링에서 입력한 객체를 싱글톤패턴으로 자동 생성해준다.
	UsedGoodRepository usedGoodsRepository;
	
	//get used_goods list from the db's table
	public List<UsedGoods> getUsedGoodList() {
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsesdGoodList();
		return usedGoodsList;
	}
}
