package com.student.bean;

public class StudentBean {
	
	private int sid;
	private String sname;
	private String sfee;
	private Address address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSfee() {
		return sfee;
	}
	public void setSfee(String sfee) {
		this.sfee = sfee;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentBean [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ",   " + address + "]";
	}
	
	

}
