"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    }
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var classes_1 = require("./classes");
var numArray;
numArray = [4, 5, 3, 2, 6, 78, 3, 4];
//numArray = [`hi`, `bye`];
function identity(arg) {
    return arg;
}
console.log(identity("Hi"));
var GenericClass = /** @class */ (function () {
    function GenericClass() {
    }
    return GenericClass;
}());
var Reader = /** @class */ (function () {
    function Reader(book) {
        this.book = book;
        this.book = book;
    }
    Reader.prototype.read = function () {
        this.book.readBook();
    };
    return Reader;
}());
var DinosaurBook = /** @class */ (function (_super) {
    __extends(DinosaurBook, _super);
    function DinosaurBook() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    DinosaurBook.prototype.readBook = function () {
        console.log("reading a book about dinos");
    };
    return DinosaurBook;
}(classes_1.Book));
var will = new Reader(new DinosaurBook("dinos are cool", 333333333, "will", 100000));
will.read();
