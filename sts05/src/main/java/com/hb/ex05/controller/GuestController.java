package com.hb.ex05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/guest")
public class GuestController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String list() {
		return "list";
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add() {
		return "add";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert() {
		return "redirect:/guest/";
	}
}
