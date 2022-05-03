package com.devandy.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devandy.web.vo.InfoVO;


@Mapper
public interface InfoDao {
	List<InfoVO> selectAll();
	InfoVO selectById(int id);
	void insert(InfoVO info);
	void update(InfoVO info);
	
}
