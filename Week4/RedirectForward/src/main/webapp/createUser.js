/**
 * 
 */

function displayMessage(message){
	document.getElementById("message").innerText = message;
}

function makeUser(username, password, role){
	let user = {};
	user.username = username;
	user.password = password;
	user.role = role;
	return user;
}

function handleEvent(){
	
	let xhr = new XMLHttpRequest();
	
	let username = document.getElementById("username").value;
	let password = document.getElementById("password").value;
	let role = document.getElementById("role").value;
	let user = makeUser(username, password, role);
	
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState == 4 && xhr.status == 200){
			displayMessage("successfully posted new user");
		}
		
	}
	
	xhr.open("POST", "rest/user", true);
	xhr.send(JSON.stringify(user));
	
}

window.onload = function(){
	document.getElementById("submit").addEventListener("click", handleEvent);
}