"use strict";
//classes are blueprints
//in angular classes are used for compenents, services, directives, pipes, and many others
exports.__esModule = true;
var Book = /** @class */ (function () {
    function Book(title, isbn, author, pageCount) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.pageCount = pageCount;
    }
    Book.prototype.getIsbn = function () {
        return this.isbn;
    };
    Book.prototype.readBook = function () {
        console.log("reading the book " + this.title);
    };
    Book.isABook = function () {
        return true;
    };
    return Book;
}());
exports.Book = Book;
var book = new Book("The Jungle Book", 4455673827, "Ted", 400000);
book.readBook();
//book.isbn = 30;  cannot access private things
console.log(Book.isABook());
