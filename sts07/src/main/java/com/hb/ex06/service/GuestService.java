package com.hb.ex06.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface GuestService {

	void list(SqlSession sqlSession, Model model) throws Exception;
	
}
