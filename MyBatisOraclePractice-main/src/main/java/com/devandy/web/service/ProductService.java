package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.ProductVO;

public interface ProductService {

	List<ProductVO> selectAllProduct();

	void insertProduct(ProductVO product);

	void updateProduct(int id, ProductVO product);

	
}
