package com.amdocs.client;

import com.amdocs.dao.FeedbackDao;
import com.amdocs.dao.imp.FeedbackDaoImp;
import com.amdocs.model.Feedback;

public class FeedbackClient {
	public static void main(String[] args) {
		
		FeedbackDao dao = new FeedbackDaoImp();
		Feedback feedback = new Feedback(101,"ankit","ankit@gmail.com",1,"good");
		if(dao.saveFeedback(feedback)) {
		System.out.println("Feedback Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}
