var request;
function callEmployeeData(){
var value=document.getElementById("salary").value;
var url= "SearchwithAjaxServlet?salary="+value;

if(window.XMLHttpRequest){
request = new XMLHttpRequest();
	}
	else if(window.ActiveXObject){
	request = new ActiveXObject("Microsoft.XMLHTTP");
	}
	try{
	request.onreadystatechange= displayEmployeeData;
	request.open("GET",url,true);
	request.send();
	}catch(e){
	alert("unable to connect to server");
	}
}
	function displayEmployeeData(){
	if(request.readtState=4){
		var val =request.responseText;
		document.getElementById("responseId").innerHTML=val;
		}
	}
