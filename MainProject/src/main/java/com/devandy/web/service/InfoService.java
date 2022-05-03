package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.InfoVO;


public interface InfoService {

	List<InfoVO> selectAllInfo();

	void insertInfo(InfoVO info);

	void updateInfo(int id, InfoVO info);

	
	
}
