package com.hong.spring.ex.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hong.spring.ex.database.domain.UsedGoods;

//use Mybatis Framework
//work for database query execute
@Repository
public interface UsedGoodRepository {
	//return that seleted datas from used_goods table
	public List<UsedGoods> selectUsesdGoodList();
}
