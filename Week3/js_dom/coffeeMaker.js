window.onload = function(){

}

let makeCoffee = function(size, blend, roast, quantity){
    let coffee = {};
    coffee.size = size;
    coffee.roast = roast;
    coffee.blend = blend;
    coffee.quantity = quantity;
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
    return makeCoffee(sizeValue, blend.value, roastValue, quantity.value);

}