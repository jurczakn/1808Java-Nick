//Typescript - strong typing allows us to define types of our variables

let myString: string;

myString = `This is a string`;

//4 is not assignable to a string
//myString = 4;

//TS can infer types on initialization
let anotherString = `a new string`;

//anotherString = 20;

let myNum: number;

myNum = 5;

let anotherNum = myNum;

//anotherNum = `hi`;

let aBoolean: boolean;
let anArray: Array<string>;
let anything: any; //do not use
let nothing: void;

console.log(myString + anotherString);