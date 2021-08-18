package com.amdocs.client;

import com.amdocs.dao.ContactDao;
import com.amdocs.dao.imp.ContactDaoImp;
import com.amdocs.model.Contact;

public class ContactClient {
	public static void main(String[] args) {
		
		ContactDao dao = new ContactDaoImp();
		Contact contact = new Contact(102, "Ankit", "ankit@gmail.com", 1234, "Message",2);
		if(dao.saveContact(contact)) {
		System.out.println("Contact Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}
