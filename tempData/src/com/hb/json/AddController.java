package com.hb.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1=request.getParameter("sabun");
		String param2=request.getParameter("email");
		String param3=request.getParameter("pay");
		System.out.println(param1+","+param2+","+param3);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json; charset=UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST");
		PrintWriter out = response.getWriter();
		out.print("{\"result\":\"true\"}");
		out.close();
	}

}
