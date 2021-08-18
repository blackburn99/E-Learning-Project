package com.java.frontend.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class UserController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username"); String email = request.getParameter("email");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));. long phone - Long-parselong(request.getParameter("phon())
		Printwriter out = response.getwriter();

		out.println("Id :" + id + ", Username." + username + " Phone + phone);
	}

}
