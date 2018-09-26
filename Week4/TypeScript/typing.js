//Typescript - strong typing allows us to define types of our variables
var myString;
myString = "This is a string";
//4 is not assignable to a string
//myString = 4;
//TS can infer types on initialization
var anotherString = "a new string";
//anotherString = 20;
var myNum;
myNum = 5;
var anotherNum = myNum;
//anotherNum = `hi`;
var aBoolean;
var anArray;
var anything; //do not use
var nothing;
console.log(myString + anotherString);
