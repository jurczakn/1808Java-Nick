/**
 * 
 */

function displayUser(user){
	document.getElementById("username").innerText = user.username;
	document.getElementById("password").innerText = user.password;
	document.getElementById("role").innerText = user.role;
}

function handleEvent(){
	
	let xhr = new XMLHttpRequest();
	
	let username = document.getElementById("usernameField").value;
	
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState == 4 && xhr.status == 200){
			let responseText = xhr.responseText;
			let user = JSON.parse(responseText);
			displayUser(user);
		}
		
	}
	
	xhr.open("GET", "rest/user/" + username, true);
	xhr.send();
	
}

window.onload = function(){
	document.getElementById("button").addEventListener("click", handleEvent);
}