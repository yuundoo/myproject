package com.devandy.web.dao;

import com.devandy.web.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDao {
	List<ProductVO> selectAll();
	ProductVO selectById(int id);
	void insert(ProductVO product);
	void update(ProductVO product);
	
}
