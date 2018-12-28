package com.jihn.service;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jihn.domain.countVO;
import com.jihn.studyDAO.studyDAO;

@Service
public class studyServiceImpl implements studyService {
	
	@Inject
	private studyDAO dao;

	@Transactional
	@Override
	public void multipledb() throws Exception {
		// TODO Auto-generated method stub
		 dao.multipledb1();
		 dao.multipledb2();
		 dao.multipledb1delete();
		 dao.multipledb2create();
		 
	}

	@Override
	public List<countVO> count() throws Exception {
		// TODO Auto-generated method stub
		return dao.count();
	}

}
