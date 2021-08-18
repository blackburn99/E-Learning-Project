package com.amdocs.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.dao.ContactDao;
import com.amdocs.jdbc.Create_Connection;
import com.amdocs.model.Contact;



public class ContactDaoImp implements ContactDao{
	Connection conn = null;
	@Override
	public boolean saveContact(Contact contact) {
		String query = "insert into contact values(?,?,?,?,?,?)";
		try {
			Connection conn = Create_Connection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, contact.getUser_id());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getEmail());
			ps.setLong(4, contact.getPhone_no());
			ps.setString(5, contact.getMessage());
			ps.setInt(6, contact.getContact_id());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
