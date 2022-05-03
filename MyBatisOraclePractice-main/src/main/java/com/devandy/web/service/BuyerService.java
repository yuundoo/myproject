package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.BuyerVO;


public interface BuyerService {

	List<BuyerVO> selectAllBuyer();

	void insertBuyer(BuyerVO buyer);

	void updateBuyer(int id, BuyerVO buyer);


	
}
