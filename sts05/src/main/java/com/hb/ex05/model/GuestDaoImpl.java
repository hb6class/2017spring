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

	@Override
	public void insertOne(GuestVo bean) {
		session.insert("com.hb.ex05.model.GuestDao.insertOne", bean);
	}

	@Override
	public GuestVo selectOne(int sabun) {
		return session.selectOne("com.hb.ex05.model.GuestDao.selectOne",sabun);
	}

	@Override
	public int updateOne(GuestVo bean) {
		return session.update("com.hb.ex05.model.GuestDao.updateOne", bean);
	}

	@Override
	public int deleteOne(int sabun) {
		
		return session.delete("com.hb.ex05.model.GuestDao.deleteOne", sabun);
	}

	@Override
	public void payPlus(int sabun) {
		// update guest03 set pay=pay+1 where sabun=sabun
		session.update("com.hb.ex05.model.GuestDao.payPlus",sabun);
	}

}
