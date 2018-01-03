package com.hb.ex05.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hb.ex05.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {
	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<GuestVo> selectAll() {
		return session.selectList("com.hb.ex05.model.GuestDao.selectAll");
	}

}
