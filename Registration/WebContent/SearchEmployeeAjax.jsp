<%@page import="com.employee.bean.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchingWithAjax</title>
<script type="text/javascript" src="validate.js"></script>
</head>
<body>
	
EnterEmployeeSalary : <input type="text" id="salary" name="salary" onkeypress="callEmployeeData()">
		
	<div id="responseId">
		
	</div>

</body>
</html>