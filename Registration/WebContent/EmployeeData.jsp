<%@page import="com.employee.serviceimpl.EmployeeServiceImpl"%>
<%@page import="com.employee.service.EmployeeService"%>
<%@page import="com.employee.bean.EmployeeBean" %>
<%@page import="java.util.List"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Display All EmployeeData</title>
</head>
<body>
<table>
<h2> Display Total Employee Data</h2>
<tr><th>EmployeeId</th>
<th>EmployeeName</th>
<th>EmployeeSalary</th>
<th>EmployeeMobile no</th>
<th>EmployeeAddress</th>
</tr>
<% 
EmployeeService service = new EmployeeServiceImpl();
List<EmployeeBean> listOfemp = service.getAllEmployeeData();
if(null!=listOfemp && !listOfemp.isEmpty()){
	for(EmployeeBean employee : listOfemp){
		%>
		<tr>
		<td><%=employee.getEmployeeId() %></td>
		<td><%=employee.getEmployeName() %></td>
		<td><%=employee.getSalary() %></td>
		<td><%=employee.getMobileno() %></td>
		<td><%=employee.getEmpAddress() %></td>
		</tr>
		<%
	}
}else{
	out.print("No Data Found");
}
%>
</table>
</body>
</html>