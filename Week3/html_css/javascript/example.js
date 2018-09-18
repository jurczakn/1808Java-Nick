/*
**Let's do some JavaScript
*/
//"use strict";

//undefined = 6;

//var ob = {x : 10, y : 11, x : 12};

function myTest(x, y, y){
    console.log(x + y);
}

var a = {   value: 10,
            secondValue: 20,
            doA: function(){console.log(this.value);}
        };

var b, c, d, e, f, g, h, i;

b = '10';
c = true;
d = {};
e = null;
//f =
g = (0/0);
h = [];
function i (){};

//console.log('value of a is ' + a);

function myFunc(x){
    x.value = 20;
    console.log('value of x in myFunc is ' + x.value);
}

console.log('a before myFunc ' + a.value);
myFunc(a);
console.log('a after myFunc' + a.value);

function myFunc2(x){
    x = 30;
    console.log('value of x in myFunc is ' + x);
}

console.log('a before myFunc2 ' + a.value);
myFunc2(a.value);
console.log('a after myFunc2 ' + a.value);

function badReturn(b){
    if(b){
        return "10";
    }
    else {
        return 10;
    }
}

function add(x, y, z){
    console.log('inside 3 param add')
    return x + y + z
}

function add(x, y){
    console.log('inside 2 param add')
    return x + y;
}

var add = function(x, y, z, a){
    return x + y + z + a;
}

add = function(a, b, c, d, e, f){
    console.log("" + a + b + c + d + e + f)
    console.log(arguments)
    //return a + b + c + d + e + f;
    let ret = 0;
    for (i in arguments){
        ret += arguments[i]
    }
    return //<------ semi-colon injection
    ret;
}

var myBird = {
    name: 'cockatou',
    wingspan: 30,
    age: 5061,
    height: 10,
    fly: function(){console.log('there it goes')}
}

//Maker function
function makeBird(name, wingspan, age, height){
    let bird = {};
    bird.name = name;
    bird.wingspan = wingspan;
    bird.age = age;
    bird.height = height;
    bird.fly = function(){console.log('there it goes')}
    return bird;
}

var Bird = function(){};
Bird.prototype.fly = function(){console.log('it is up in the air');};

var dodoBird = function(){};
dodoBird.prototype = new Bird();
dodoBird.prototype.goExtinct = function(){console.log('there it went');};