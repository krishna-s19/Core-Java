<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
<link rel="stylesheet"href="../node_modules/bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" href="../Fonts/css/all.css">
<script src="../node_modules/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="Login.js"></script>
<script src="../node_modules/bootstrap/dist/js/bootstrap.bundle.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
form {
	width: 400px;
	padding: 25px;
	margin-left: 40%;
	border: 2px solid gray;  
	border-radius: 10px;
	box-shadow: 10px 10px 15px black;
	margin-top: 60px;
}
</style>
</head>
<body>
		<form action="LoginServlet2"  method="post">
				<div class="text-center">
						<h2 >Singup</h2>
				</div>
				
				<div class="form-group mt-5">
					<label>UserName :</label>
					<div>
						<input type="text" class="form-control" name="username" id ="username" placeholder="User Name">
					</div>
					<div class="form-group mt-2">
					<label>Password:</label>
					<div>
						<input type="password" class="form-control" name="password" id="password" placeholder="password">
					</div>
				</div>
			
			<div class="form-group">
					<div class="form-check">
						 <a href=Registration.jsp>New User Click Here</a>
					</div>
				</div>
					<div class="form-group" style="margin-left: 40%;">
					<button class="btn btn-success" onclick="return doValidateForm()">Submit</button>
					<input type= reset  class="btn btn-warning" value="reset">
</body>
</html>