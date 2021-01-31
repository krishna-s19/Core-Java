package com.login.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.login.bean.LoginBean;
import com.login.service.LoginService;
import com.login.serviceimpl.LoginServiceImpl;

public class LoginTest {
	LoginService service = new LoginServiceImpl();
	@Test
	public void testLogin() {
		int status=0;
		LoginBean login = new LoginBean();
		login.setUsername("krishna");
		login.setPassword("vaman");
		status = service.login(login);
		assertEquals(1, status);
	}
	
}
