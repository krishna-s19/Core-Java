function doValidateForm(){
	var employeeId = document.getElementById("employeeId").value;
	var employeeName = document.getElementById("employeeName").value;
	if(employeeId == null || employeeId ==""){
	alert("please enter employee id");
	//document.getElementById("eidError").innerHTML="Please Enter EmployeeId";
	return false;
	}else if(employeeName==null ||employeeName==""){
	alert("please enter employee Name");
	//document.getElementById("enameError").innerHTML="Please Enter EmployeeName";
	return false;
	}else {
	return true;
	}
}