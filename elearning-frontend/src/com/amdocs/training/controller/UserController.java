package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sun.awt.RepaintArea;

@WebServlet("/register")
public class UserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		long phone = Long.parseLong(request.getParameter("phone"));

		User user = new User(id, username, password, age, phone, email);
		
		UserDAO dao = new UserDaoImp();
		
		boolean saveUser = dao.saveUser(user);
		
		if(saveUser) {
			out.println("User Saved Successfully!");
		}
		else {
			out.println("try again");
		}
		

	}
}
