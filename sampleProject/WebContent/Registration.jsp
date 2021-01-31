<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Registration form</title>
<link rel="stylesheet"
	href="../node_modules/bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" href="../Fonts/css/all.css">
<script src="../node_modules/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="validation.js"></script>
<script src="../node_modules/bootstrap/dist/js/bootstrap.bundle.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
form {
	width: 600px;
	padding: 20px;
	margin-left: 30%;
	border: 2px solid gray;
	border-radius: 10px;
	box-shadow: 10px 10px 15px black;
	margin-top: 50px;
}
img:hover {
	width: 300px;
	height: 300px;
	transition-duration: 2s;
}
</style>
</head>

<body class="container-fluid">
	<div
		style="border: 1px solid gray; border-bottom: none; border-top: none; border-right: none; 
		box-shadow: 5px 5px 10px black;">
		<nav class="navbar sticky-top navbar-dark bg-primary">
		 <a class="navbar-brand" href="#!">
  		<h2 align="center" class="p-2 text-center">Online Registration </h2>
		 </a>
		</nav>
		</div>
	<div style="display: flex;">
		<div style="margin-left: 20%;">
			<form action="EmployeeServlet"  method="post">
				<div class="text-center">
					<h2>Employee Registration Form</h2>
				</div>
				
				<div class="form-group mt-5">
					<label>Employee Id:</label>
					<div>
						<input type="text" class="form-control" name="employeeId" id ="employeeId" placeholder="Employee Id">
					</div>
					<div class="form-group mt-3">
					<label>Employee Name:</label>
					<div>
						<input type="text" class="form-control" name="employeeName" id="employeeName" placeholder="Employee Name">
					</div>
				</div>

				<div class="form-group">
					<label>EmployeeSalary:</label>
					<div>
					<input type="text" class="form-control" id="empSalary" name="empSalary" placeholder="Enter Salary">
					</div>
				</div>
				<div class="form-group">
					<label>Mobile:</label>
					<div>
						<input type="Number" class="form-control"  id="mobileNo" name="mobileNo"	placeholder="Contact Number">
					</div>
				</div>
					<div class="form-group">
					<label>EmployeeAddress:</label>
					<div>
					<input type="text" class="form-control" id="empAddress" name="empAddress" placeholder="Enter Address">
					</div>
				</div>
				<div class="form-group">
					<div class="form-check">
						<input type="checkbox" class="form-check-input"> <label
							class="form-check-label">I've read and Accept the <a>Terms
								and Conditions</a></label>
					</div>
				</div>
				<div style="display: flex;">
					<div class="form-group text-center ml-4">
						<input type= "reset" class="btn btn-warning">
					</div>
					<div class="form-group" style="margin-left: 40%;">
						<button class="btn btn-success" onclick=" return doValidateForm()">Submit</button>
						
					</div>
				</div>
			</form>
		</div>

	</div>
</body>
</html>