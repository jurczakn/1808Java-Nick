class Pastry{
    constructor(filling, type, moistness, calories){
        this.filling = filling;
        this.moistness = moistness;
        this.type = type;
        this.calories = calories;
    }

    eat(){
        console.log('this was delicious, i cannot believe it was only ' + this.calories + ' calories.');
    }

}

class Doughnut extends Pastry{
    constructor(filling, moistness, calories, frosting){
        super(filling, 'doughnut', moistness, calories);
        this.frosting = frosting;
    }

    ringToss(){
        console.log("I hit the bullseye, but I don't know why I did this with a " + this.frosting + ' covered doughnut.');
    }

    eat(){
        console.log('this was delicious, i cannot believe it was only ' + this.calories + ' calories, and it also has a hole in it');
    }
}

const widthId = Symbol("width");
const lengthId = Symbol("length");

class Rectangle{

    constructor(width, length){
        this[widthId] = width;
        this[lengthId] = length;
        this.area = width * length;
    }

    displayLengthWidth(){
        console.log("width: " + this[widthId]);
        console.log("length: " + this[lengthId]);
    }

}