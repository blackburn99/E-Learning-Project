package com.admdocs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.dao.UserDao;
import com.amdocs.dao.imp.UserDaoImp;
import com.amdocs.model.User;


@WebServlet("/register")
public class UserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		String username = req.getParameter("username");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String reg_date = req.getParameter("reg_date");
		String password = req.getParameter("password");
		String upload_photo = req.getParameter("upload_photo");
		
		User user = new User(id, username, phone, email, address, reg_date, password,
				upload_photo);
		System.out.println("New Entry - "+id+" "+username+" "+phone+" "+email+" "+address+" "+reg_date+" "+password+" "+upload_photo);
		UserDao dao = new UserDaoImp();
		
		boolean saveUser = dao.saveUser(user);
		
		if(saveUser) {
			System.out.println(user);
			out.println("User Saved Successfully!");
		}
		else {
			out.println("Some Error Occured, Try Again");
		}
	}

}
