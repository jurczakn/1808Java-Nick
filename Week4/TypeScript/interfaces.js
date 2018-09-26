//Interfaces are contracts for other classes and objects
//Can be used to define custom types without creating classes
//Interfaces do not get compiled to JS
let runner;
runner = { type: 'distance', topSpeed: 25, acceloration: 5 };
runner = { type: 'distance', topSpeed: 25 }; //must have all fields
// cannot have more
runner = { type: 'distance', topSpeed: 25, acceloration: 5, shoes: 'adidas' };
runner = { type: 'distance', topSpeed: 25, acceloration: 10, age: 20 };
