package com.hb.ex06.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.hb.ex06.model.GuestDao;


public class GuestServiceImpl implements GuestService {

	@Override
	public void list(SqlSession sqlSession, Model model) throws Exception {
		GuestDao dao = sqlSession.getMapper(GuestDao.class);
		model.addAttribute("list", dao.selectAll());
	}

}
