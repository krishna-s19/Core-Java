<%@page import="com.employee.bean.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SearchEmployeeServlet" method="get">
		EnterEmployeeSalary : <input type="text" id="salary" name="salary">
		<input type="submit" value="fetch">
	</form>
	<div id="responseId">
		<table>
			<tr>
				<th>EmployeeId</th>
				<th>EmployeeName</th>
				<th>EmployeeSalary</th>
				<th>EmployeeMobileNo</th>
				<th>EmployeeAddress</th>
			</tr>
			<%
				Object obj = session.getAttribute("SalarySearch");
			if (obj != null) {
				List<EmployeeBean> listofEmp = (ArrayList) obj;
				if (listofEmp != null && !listofEmp.isEmpty()) {
					for (EmployeeBean empl : listofEmp) {
			%>
			<tr>
				<td><%=empl.getEmployeeId()%></td>
				<td><%=empl.getEmployeName()%></td>
				<td><%=empl.getSalary()%></td>
				<td><%=empl.getMobileno()%></td>
				<td><%=empl.getEmpAddress()%></td>
			</tr>
			<%
				}
			}
			}
			%>

		</table>
	</div>

</body>
</html>