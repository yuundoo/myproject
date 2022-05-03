package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.ProductDao;
import com.devandy.web.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<ProductVO> selectAllProduct() {
		return productDao.selectAll();
	}

	@Override
	public void insertProduct(ProductVO product) {
		productDao.insert(product);
	}

	@Override
	public void updateProduct(int id, ProductVO updateProduct) {
		ProductVO product = productDao.selectById(id);
		if(product!=null){
			product.setItemname(updateProduct.getItemname());
			
			productDao.update(product);
		} else {
			throw new IllegalStateException("상품이 존재하지 않습니다.");
		}
	}

	

}
