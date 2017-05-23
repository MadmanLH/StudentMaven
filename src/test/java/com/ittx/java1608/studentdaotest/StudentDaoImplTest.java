package com.ittx.java1608.studentdaotest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.java1608.studentmanager.dao.StudentDao;
import com.ittx.java1608.studentmanager.model.Student;

public class StudentDaoImplTest {
	private StudentDao studentDao;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml"});
		studentDao = context.getBean(StudentDao.class);
	}

	@Test
	public void testGetAllUser() {
		List<Student> userLists = studentDao.getAllUser();
		for(Student student: userLists){
			System.out.println(student);
		}
	}

}
