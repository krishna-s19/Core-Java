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
body {
    padding: 0px;
    margin: 0px;
    background: url(blue.jpg) no-repeat;
    background-size: cover;
      
    }
form {
	width: 800px;
	padding: 20px;
	margin-left: 10%;
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
			<form action="EmployeeRegistrationServlet"  method="post">
				<div class="text-center">
					<h2>Employee Registration Form</h2>
				</div>
						<div class="form-group mt-3">
					<label>EmployeeId:</label><font color="red">*</font>
					<div>
						<input type="text" class="form-control" name="employeeId" id="employeeId" placeholder="Employee Name">
					</div>
				</div>		
					<div class="form-group mt-3">
					<label>Employee Name:</label><font color="red">*</font>
					<div>
						<input type="text" class="form-control" name="employeeName" id="employeeName" placeholder="Employee Name">
					</div>
				</div>
					<div class="form-group mt-3">
					<label>Employee Designation:</label><font color="red">*</font>
					<div>
						<input type="text" class="form-control" name="Designation" id="Designation" placeholder="Designation">
					</div>
				</div>
				 <div class="form-group">
                    <div>
                        <label>Gender</label><font color="red">*</font>
                    </div>
                    <div class="form-check form-check-inline">
                        <div>
                            <input class="form-check-input" type="radio" name="gender" id="gender" value="Male">
                            <label class="form-check-label">Male</label>
                        </div>
                    </div>
                    <div class="form-check form-check-inline">
                        <div>
                            <input class="form-check-input" type="radio" name="gender" id="gender" value="Femlae"> 
                            <label class="form-check-label">Female</label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label>Date:</label><font color="red">*</font>
                    <div>
                        <input type="date" class="form-control" placeholder="Date" id="date" name="date">
                    </div>
                </div>
				<div class="form-group">
					<label>Mobile:</label><font color="red">*</font>
					<div>
						<input type="Number" class="form-control"  id="mobileno" name="mobileno"	placeholder="Contact Number">
					</div>
				</div>
				 <div class="form-group">
                    <label>Email:</label><font color="red">*</font>
                    <div>
                        <input type="email" class="form-control"  id="emailId"  name="email" placeholder="Email Id">
                    </div>
                    <div class="form-group">
                    <label>Password:</label><font color="red">*</font>
                    <div>
                        <input type="password" class="form-control"  id ="password" name="password" placeholder="Password">
                    </div>
                </div>
                <div class="form-group">
                    <label>Confirm Password:</label><font color="red">*</font>
                    <div>
                        <input type="password" class="form-control" id="new-password" name="password" placeholder="Confirm Password">
                    </div>
                </div>
				<div class="row">
						<div class="col-sm-4" align="left">
							Aadhar Number:<font color="red">*</font> <input type=text
								name="aadharNo" onkeypress="clearForm()" id="aadharNo"
								pattern="[0-9]{12}" title="Aadhar Card Number must be 12 digits"
								placeholder="Enter AadharCardNumber" required>
							<p id="errorMsg7" style="color: red;"></p>
						</div>
						<div class="col-sm-4" align="left">
							PAN Number:<font color="red">*</font>
							 <input type="text"	name="panNo" onkeypress="clearForm()" id="panNo"
								pattern="{10}" title="PAN Card Number must be 10 digits"
								placeholder="Enter PANCardNumber" required>
							<p id="errorMsg25" style="color: red;"></p>
						</div>
				</div>
			
					<div class="form-group">
					<label>EmployeeAddress:</label><font color="red">*</font>
					<div>
					<textarea onkeypress="clearForm()" id="adress"
								name="address"></textarea>
					
					</div>
				</div>
			
<p styple="padding-left :0cm;">_________________________________________________________________________________________________________________</p>
					<h2 align="center">Educational Information</h2>
					<br>
			
					<div class="row">
						<div class="col-sm-6" align="center">
							Board Of Secondary Education:<font color="red">*</font>
							&nbsp;&nbsp;&nbsp;<input type=text name="schoolName"
								onkeypress="clearForm()" id="schoolName"><br> <br>
							<p id="errorMsg10" style="color: red;"></p>
						</div>
						<div class="col-sm-6" align="left">
							Passedout:<font color="red">*</font> <input type=text
								name="tenthPassedOut" onkeypress="clearForm()"
								id="tenthPassedOut" maxlength="4"
								title="Only 4 digits are allowed">
							<p id="errorMsg11" style="color: red;"></p>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-6" align="center">
						
							Board Of Intermediate Education:<font color="red">*</font> <input
								type=text name="intermediateCollegeName"
								onkeypress="clearForm()" id="intermediateCollegeName"> 
							
							<p id="errorMsg12" style="color: red;"></p>
						</div>

						<div class="col-sm-6" align="left">
							Passedout:<font color="red">*</font> <input type=text
								name="interPassedOut" onkeypress="clearForm()"
								id="interPassedOut" maxlength="4"
								title="Only 4 digits are allowed">
							<p id="errorMsg13" style="color: red;"></p>
						</div>
					</div>
					
					<div class="row">
						<div class="col-sm-12" align="center">
						<div id="dynamicInput"></div>
						<input type="button" value="Graduation Details" id="GraduationDetails"
						 name="GraduationDetails" onclick="addDetails('dynamicInput')">
						</div>
					</div><br>
					
					<div class="row">
						<div class="col-sm-3"  align="left">
							 Graduation Details:<font color="red">*</font><br> 
							 <select	name="graduationDetails" onkeypress="clearForm()"
								id="graduationDetails">
								<option value="None">Select Branch</option>
								<option value="B.Tech">B.TECH</option>
								<option value="M.Tech">M.TECH</option>
								<option value="MBA">MBA</option>
								<option value="PG">PG</option>

							</select><br> <br>
							
							<p id="errorMsg14" style="color: red;"></p>
						</div>
						<div class="col-sm-3" align="left">
							Passedout:<font color="red">*</font> <input type=text
								name="graduationPassedOut" onkeypress="clearForm()"
								id="graduationPassedOut" maxlength="4"
								title="Only 4 digits are allowed">
							<p id="errorMsg15" style="color: red;"></p>
						</div><br>
						<div class="col-sm-3" align="left">
							Branch:<font color="red">*</font> <select name="branch"
								onkeypress="clearForm()" id="branch">
								<option value="None">Enter Your Branch</option>
								<option value="ECE">ECE</option>
								<option value="EEE">EEE</option>
								<option value="CSE">CSE</option>
								<option value="Civil">CIVIL</option>
								<option value="Mechanical">MECHANICAL</option>
								<option value="Bcom">Bcom</option>
							</select>
							<p id="errorMsg16" style="color: red;"></p>
						</div>
						<div class="col-sm-3" align="left">
							University:<font color="red">*</font> <input type=text
								name="university" onkeypress="clearForm()" id="university">
							<p id="errorMsg17" style="color: red;"></p>
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