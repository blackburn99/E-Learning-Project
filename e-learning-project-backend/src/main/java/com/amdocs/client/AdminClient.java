package com.amdocs.client;

import com.amdocs.dao.AdminDao;
import com.amdocs.dao.imp.AdminDaoImp;
import com.amdocs.model.Admin;

public class AdminClient {
	public static void main(String[] args) {
		
		AdminDao dao = new AdminDaoImp();
		Admin admin = new Admin(101,"admin1", "admin@123", "admin@gmail.com");
		if(dao.saveAdmin(admin)) {
		System.out.println("Admin Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}
