package com.login.service;

import com.login.bean.LoginBean;

public interface LoginService {
	public int validateLogin(LoginBean login);
	public int login(LoginBean login);
	public int login(String sname, String spass);

}
