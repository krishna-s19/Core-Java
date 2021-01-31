<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body {
	margin: 0;
	padding: 0;
	background: url(cup.jpg);
	background-size: cover; 
	background-position: top;
	background-repeat:no-repeat;
	font-family: sans-serif;
}

.bs-example {
	margin: 10px;
}
img {
  opacity: 0.7;
}
</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<img src="Dev.PNG" height="150px"  width="600px">
	<div class="bs-example">
	<nav class="navbar navbar-expand-md navbar-dark bg-primary"">
        <a href="#" class="navbar-brand">Aboutus</a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
		
		
			<div id="navbarCollapse" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="nav-item"><a href="#" class="nav-link">Home</a></li>
					
					<li class="nav-item dropdown">
					<a href="#"	class="nav-link dropdown-toggle" data-toggle="dropdown">Registration</a>
						<div class="dropdown-menu">
							<a href="Registration.jsp" class="dropdown-item">New Registration</a> 
							<a href="#"class="dropdown-item">Search</a>
								 <a href=""	class="dropdown-item">Update</a>
							  <a href="#"	class="dropdown-item">Delete</a>
							<div class="dropdown-divider"></div>
						</div></li>

		<li class="nav-item dropdown">
					<a href="#"	class="nav-link dropdown-toggle" data-toggle="dropdown">Login</a>
						<div class="dropdown-menu">
							<a href="AdminLogin.jsp" class="dropdown-item">AdminLogin</a> 
							<a href="Loginpage.jsp"class="dropdown-item">EmployeeLogin</a>
							<div class="dropdown-divider"></div>
						</div></li>

				
				<ul class="nav navbar-nav ml-auto">
					<li class="nav-item dropdown">
					<a href="#"	class="nav-link dropdown-toggle" data-toggle="dropdown">Admin</a>
						<div class="dropdown-menu dropdown-menu-right">
							<a href="Loginpage.jsp" class="dropdown-item">Login</a>
							 <a href="#"class="dropdown-item">Settings</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item">Logout</a>
						</div></li>
				</ul>
			</div>
		</nav>
	</div>
</body>
</html>
