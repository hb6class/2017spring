package com.hb.ex05.service;

import org.springframework.ui.Model;

import com.hb.ex05.model.entity.GuestVo;

public interface GuestService {
	void listAll(Model model);	
	void addOne(GuestVo bean);
	void detailOne(int sabun,Model model);
	void editOne(int sabun,Model model);
}
