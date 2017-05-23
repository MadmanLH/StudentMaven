package com.ittx.java1608.usermanager.dao.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.java1608.usermanager.dao.UserDao;
import com.ittx.java1608.usermanager.model.User;

public class UserDaoImplTest {
	private UserDao userDao;
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-core.xml"});
		userDao = context.getBean(UserDao.class);
	}

	@Test
	public void testGetAllUser() {
		List<User> userLists = userDao.getAllUser();
		for(User user: userLists){
			System.out.println(user);
		}
	}

}
