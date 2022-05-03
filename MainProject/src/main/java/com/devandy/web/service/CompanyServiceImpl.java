package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.CompanyDao;
import com.devandy.web.vo.CompanyVO;


@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public List<CompanyVO> selectAllCompany() {
		return companyDao.selectAll();
	}

	@Override
	public void insertCompany(CompanyVO company) {
		companyDao.insert(company);
	}

	@Override
	public void updateCompany(int id, CompanyVO updateCompany) {
		CompanyVO company = companyDao.selectById(id);
		if(company!=null){
			company.setCeo_name(updateCompany.getCeo_name());
			
			companyDao.update(company);
		} else {
			throw new IllegalStateException("상품이 존재하지 않습니다.");
		}
	}

	

}
