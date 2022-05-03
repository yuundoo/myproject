package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.InfoDao;
import com.devandy.web.vo.InfoVO;


@Service
public class InfoServiceImpl implements InfoService{
	
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public List<InfoVO> selectAllInfo() {
		return infoDao.selectAll();
	}

	@Override
	public void insertInfo(InfoVO info) {
		infoDao.insert(info);
	}

	@Override
	public void updateInfo(int id, InfoVO updateInfo) {
		InfoVO info = infoDao.selectById(id);
		if(info!=null){
			info.setPro_info(updateInfo.getPro_info());
			
			infoDao.update(info);
		} else {
			throw new IllegalStateException("정보가 존재하지 않습니다.");
		}
	}

	

	

}
