//classes are blueprints
//in angular classes are used for compenents, services, directives, pipes, and many others

export class Book{
    //fields
    public title: string;
    private isbn: number;
    public author: string;
    protected pageCount: number;

    constructor(title: string, isbn: number, author: string, pageCount: number){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.pageCount = pageCount;
    }

    public getIsbn (): number{
        return this.isbn;
    }

    public readBook(): void{
        console.log(`reading the book ` + this.title);
    }

    static isABook(): boolean{
        return true;
    }

}

let book = new Book(`The Jungle Book`, 4455673827, `Ted`, 400_000);
book.readBook();
//book.isbn = 30;  cannot access private things
console.log(Book.isABook());