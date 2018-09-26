import { Book } from './classes';

let numArray: Array<number>;
numArray = [4, 5, 3, 2, 6, 78, 3, 4];
//numArray = [`hi`, `bye`];

function identity<T>(arg: T): T{
    return arg;
}

console.log(identity(`Hi`));

class GenericClass<T> {
    stuff: T;
    stuff2: T;
    add: (x: T, y: T) => T;
}

let genericClass = new GenericClass<string>();
genericClass.add = function(x: string, y: string): string{
    return x + y;
}

/* class GenericStringClass extends GenericClass<string>{
    add = function(x: string, y:string): string{
        return x + y;
    }
} */

class Reader<T extends Book> {

    constructor(private book: Book){
        this.book = book;
    }

    public read(): void{
        this.book.readBook();
    }

}

class DinosaurBook extends  Book{

    public readBook(): void{
        console.log(`reading a book about dinos`);
    }

}

let will = new Reader<DinosaurBook>
(new DinosaurBook(
    `dinos are cool`, 333333333, `will`, 100000));
will.read();