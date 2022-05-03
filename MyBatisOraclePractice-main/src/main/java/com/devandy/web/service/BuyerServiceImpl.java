package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.BuyerDao;
import com.devandy.web.vo.BuyerVO;

@Service
public class BuyerServiceImpl implements BuyerService{
	
	@Autowired
	private BuyerDao BuyerDao;
	
	@Override
	public List<BuyerVO> selectAllBuyer() {
		return BuyerDao.selectAll();
	}

	@Override
	public void insertBuyer(BuyerVO buyer) {
		BuyerDao.insert(buyer);
	}

	@Override
	public void updateBuyer(int id, BuyerVO updateBuyer) {
		BuyerVO buyer = BuyerDao.selectById(id);
		if(buyer!=null){
			buyer.setName(updateBuyer.getName());
			
			BuyerDao.update(updateBuyer);
		} else {
			throw new IllegalStateException("상품이 존재하지 않습니다.");
		}
	}

	

}
