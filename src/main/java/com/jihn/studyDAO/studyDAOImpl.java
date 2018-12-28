package com.jihn.studyDAO;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jihn.domain.countVO;

@Repository
public class studyDAOImpl implements studyDAO{

	/*@Inject
	private SqlSession query;*/

	private static String namespace="com.jihn.mappers.query";
	
	//@Autowired
	@Resource(name="sqlSession")
	private SqlSession query;

	
	//@Autowired
	@Resource(name="sqlSession2")
	private SqlSession query2;
	
	@Override
	public void multipledb1() throws Exception {
		// TODO Auto-generated method stub
		int count = query.selectOne(namespace+".multipledb1");
	    System.out.println("test.mybatis_table COUNT 결과:"+count);
	}
	
	public void multipledb2() throws Exception {
	    int count = query2.selectOne(namespace+".multipledb2");
	    System.out.println("sample.grid_sample COUNT 결과:"+count);
	}

	@Override
	public void multipledb1delete() throws Exception {
		// TODO Auto-generated method stub
		query.delete(namespace+".multipledb1delete");
	}
	
	@Override
	public void multipledb2create() throws Exception {
		// TODO Auto-generated method stub
		query2.insert(namespace+".multipledb2create");
	}

	@Override
	public List<countVO> count() throws Exception {
		// TODO Auto-generated method stub
		return query.selectList(namespace+".count");
	}
}
