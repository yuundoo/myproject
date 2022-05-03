package com.devandy.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.devandy.web.vo.BuyerVO;


@Mapper
public interface BuyerDao {
	List<BuyerVO> selectAll();
	BuyerVO selectById(int id);
	void insert(BuyerVO buyer);
	void update(BuyerVO buyer);
	
}
