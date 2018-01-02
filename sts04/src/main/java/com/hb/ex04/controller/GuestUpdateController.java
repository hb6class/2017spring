package com.hb.ex04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex04.model.entity.GuestVo;

@Controller
public class GuestUpdateController {

	@RequestMapping(value="/guest/bbs",method=RequestMethod.POST)
	public String insert(GuestVo bean) {
		
		
		return "redirect:/guest/bbs";
	}
}
