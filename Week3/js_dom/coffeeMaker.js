window.onload = function(){

    document.getElementById("submitId").addEventListener("click", function(event){addToTable(event);});

    let loc = document.createElement("input");
    loc.setAttribute("type", "text");
    loc.setAttribute("id", "locationId");
    loc.setAttribute("name", "location");

    let locLable = document.createElement("label");
    locLable.setAttribute("for", "location");
    locLable.innerHTML = "Location: ";

    let form = document.getElementsByTagName("form")[0];
    console.log(form.lastElementChild);
    form.insertBefore(locLable, form.lastElementChild);
    form.insertBefore(document.createElement("br"), form.lastElementChild);
    form.insertBefore(loc, form.lastElementChild);
    form.insertBefore(document.createElement("br"), form.lastElementChild);
}

let makeCoffee = function(size, blend, roast, quantity, location){
    let coffee = {};
    coffee.size = size;
    coffee.roast = roast;
    coffee.blend = blend;
    coffee.quantity = quantity;
    coffee.location = location;
    return coffee;
}

let getCoffee = function(){
    let blend = document.getElementById("blendId");
    console.log(blend.value);
    let roast = document.getElementById("roastId");
    console.log(roast.checked);
    let roastValue = (roast.checked)? 'Dark' : 'Light';
    let size = document.getElementsByName("size");
    let sizeValue = '';
    for(i of size){
        console.log(i.value + ' is checked: ' + i.checked);
        if (i.checked) {
            sizeValue = i.value;
        }
    }
    let quantity = document.getElementById("quantityId");
    console.log(quantity.value);
    let location = document.getElementById("locationId");
    return makeCoffee(sizeValue, blend.value, roastValue, quantity.value, location.value);
}

let addToTable = function(event){
    event.preventDefault();
    let coffee  = getCoffee();
    let row = document.createElement("tr");
    let size = document.createElement("td");
    size.innerHTML = coffee.size;
    let blend = document.createElement("td");
    blend.innerHTML = coffee.blend;
    let roast = document.createElement("td");
    roast.innerHTML = coffee.roast;
    let quantity = document.createElement("td");
    quantity.innerHTML = coffee.quantity;
    let location = document.createElement("td");
    location.innerHTML = coffee.location;
    row.appendChild(size);
    row.appendChild(blend);
    row.appendChild(roast);
    row.appendChild(quantity);
    row.appendChild(location);
    document.getElementsByTagName("table")[0].appendChild(row);
}