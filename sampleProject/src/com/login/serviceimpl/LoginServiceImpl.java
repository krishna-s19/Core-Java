package com.login.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.bean.LoginBean;
import com.login.dbconnection.JDBCConnection;
import com.login.service.LoginService;

public class LoginServiceImpl implements LoginService  {

	Connection con = null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	
	public LoginServiceImpl() {
		con = JDBCConnection.getIstanceOf();
	}
	@Override
	public int validateLogin(LoginBean login) {
		// TODO Auto-generated method stub
		String sql ="select count(*) from login_table where username =? and password=?";
		int count=0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());
			rs = ps.executeQuery();
			if(rs!=null) {
				rs.next();
				
				count =rs.getInt(1);
				//System.out.println(login.getUsername()+"\t\t"+login.getPassword()+"\t\t"+count);
					}
				} 
			catch (SQLException e) {
			e.printStackTrace();
			}
		return count; 
		}
	@Override
	public int login(LoginBean login) {
		int count=0;
		String sql ="select * from login_table where username=? and password=?";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());
			rs =ps.executeQuery();
			
			if(rs.next()) {
				count++;
				System.out.println("Login success");
			}else{
				System.out.println("No data found");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}
	@Override
	public int login(String sname, String spass) {
		
		int count=0;
		String sql ="select * from login_table where username=? and password=?";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, sname);
			ps.setString(2, spass);
			rs =ps.executeQuery();
			
			if(rs.next()) {
				count++;
				System.out.println("Login success");
			}else{
				System.out.println("No data found");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}
}