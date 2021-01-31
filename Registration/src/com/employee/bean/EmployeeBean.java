package com.employee.bean;

public class EmployeeBean {
	private int employeeId;
	private String employeName;
	private double salary;
	private long mobileno;
	private String empAddress;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeName=" + employeName + ", salary=" + salary
				+ ", mobileno=" + mobileno + ", empAddress=" + empAddress + "]";
	}
	
}
