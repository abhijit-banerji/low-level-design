package org.example;


import java.util.List;

public class Library implements Aggregate{

    private List<Book> bookList;

    Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator createIterator() {
       return new BookIterator(bookList);
    }

}
