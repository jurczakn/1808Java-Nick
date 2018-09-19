function getPoke(){

    let id = document.getElementById("pokeId").value;

    //AJAX - Asynchronous JavaScript and XML
    //allows to send HTTP request Asynchronously

    //Step 1. Create XHR
    let xhr = new XMLHttpRequest();

    //Step 2. Define function to handle ready state change of repsonse
    //ReadyState - represents how far the response has gotten
    //There are 5 ReadyStates
    //0-Request Initialized   1-Server Connection Established
    //2-Request Recieved      3-Processing Request
    //4-Request Finished & Response Ready
    xhr.onreadystatechange = function() {

        if (xhr.readyState === 4 && xhr.status === 200){

            let pokemans = JSON.parse(xhr.responseText);

            console.log(pokemans);

            displayName(pokemans);

        }

    }

    //Step 3. Open XHR
    xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/" + id, true);

    //Step 4. Send XHR
    xhr.send(); //<--- takes in data to place in body

}

function displayName(poke){
    document.getElementById("pokeName").innerHTML = poke.name;
}

window.onload = function(){
    document.getElementById("submitId").addEventListener("click", getPoke, true);
}