/**
 * 
 */
function handleEvent(){
	
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState == 4 && xhr.status == 200){
			let responseText = xhr.responseText;
			console.log(responseText);
			document.getElementById("text").innerText = responseText;
		}
		
	}
	
	xhr.open("GET", "text", true);
	xhr.send();
	
}

window.onload = function(){
	document.getElementById("getTextButton").addEventListener("click", handleEvent);
}