package com.hb.ex06.model;

import java.util.List;

public interface GuestDao {
	List<GuestVo> selectAll() throws Exception;
}
