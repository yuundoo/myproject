package com.devandy.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devandy.web.vo.CompanyVO;


@Mapper
public interface CompanyDao {
	List<CompanyVO> selectAll();
	CompanyVO selectById(int id);
	void insert(CompanyVO company);
	void update(CompanyVO company);
	
}
