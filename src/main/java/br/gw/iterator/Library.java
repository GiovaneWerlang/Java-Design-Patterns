package br.gw.iterator;

import java.util.List;

public class Library implements Aggregate {
    private List<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }

}
