package com.amdocs.client;

import com.amdocs.dao.UserDao;
import com.amdocs.dao.imp.UserDaoImp;
import com.amdocs.model.User;


public class UserClient {
	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImp();
		User user = new User(101, "Rahul", 9586234712L,"rahul@gmail.com","banglore","2021-12-21","rahul","img1.jpg");
		if(dao.saveUser(user)) {
		System.out.println("User Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}
