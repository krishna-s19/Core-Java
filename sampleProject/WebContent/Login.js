function doValidateForm() {
	var userName = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	if (userName == null || userName == "") {
		alert("please enter UserName");
		//document.getElementById("eidError").innerHTML="Please Enter EmployeeId";
		return false;
	} else if (password == null || password == "") {
		alert("please enter Password");
		//document.getElementById("enameError").innerHTML="Please Enter EmployeeName";
		return false;
	} else {
		return true;
	}
}