package com.amdocs.client;

import com.amdocs.dao.CourseDao;
import com.amdocs.dao.imp.CourseDaoImp;
import com.amdocs.model.Course;


public class CourseClient {

	public static void main(String[] args) {
		
		CourseDao dao = new CourseDaoImp();
		
		Course course = new Course(3001, "Design Patterns", 3500, "GOF and Sun Design Patterns", "video.mp4");
		if(dao.saveCourse(course)) {
			System.out.println("Course Added Successfully");
			}
			else {
			System.out.println("Error Cannot Insert");
			}
	}
}
