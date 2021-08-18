package com.amdocs.client;

import com.amdocs.dao.UserDao;
import com.amdocs.dao.imp.UserDaoImp;
import com.amdocs.model.User;


public class UserClient {
	public static void main(String[] args) {
		
		UserDao dao = new UserDaoImp();
		User user = new User(112, "Rahul", 8530342222L,"rahul@india.com","banglore","2021-10-10","Swap","img3.jpg");
		if(dao.saveUser(user)) {
		System.out.println("User Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}
