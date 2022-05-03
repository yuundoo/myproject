package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.CompanyVO;

public interface CompanyService {

	List<CompanyVO> selectAllCompany();

	void insertCompany(CompanyVO company);

	void updateCompany(int id, CompanyVO company);

	
	
}
