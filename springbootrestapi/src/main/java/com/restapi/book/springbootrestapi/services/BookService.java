package com.restapi.book.springbootrestapi.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.book.springbootrestapi.dao.BookRepo;
import com.restapi.book.springbootrestapi.entities.Book;

// @Component
@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    // private static List<Book> list = new ArrayList<Book>();
    // static {
    // list.add(new Book(123, "Amrutvel", "PL Deshpande"));
    // list.add(new Book(234, "Amrutvel", "PL Deshpande"));
    // list.add(new Book(345, "Amrutvel", "PL Deshpande"));
    // list.add(new Book(456, "Amrutvel", "PL Deshpande"));
    // list.add(new Book(567, "Amrutvel", "PL Deshpande"));
    // list.add(new Book(678, "Amrutvel", "PL Deshpande"));
    // }

    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    public Book getBookbyId(int id) {
        Book book = null;
        try {
            book = bookRepo.findById(id);
            // book = list.stream().filter(e -> e.getBookId() == id).findFirst().get();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book book) {
        Book resultBook = bookRepo.save(book);
        return resultBook;
    }

    public void deleteBook(int id) {
        bookRepo.deleteById(id);

        // collecting unmatched books other than id book to new list and trying to
        // list = list.stream().filter(book -> book.getBookId() != id).collect(Collectors.toList());
    }

    public void updateBook(int id, Book reqBook) {

        reqBook.setBookId(id);
        bookRepo.save(reqBook);

        // list.stream().map(listedBook -> {
        //     if (listedBook.getBookId() == id) {
        //         listedBook.setBookName(reqBook.getBookName());
        //         listedBook.setBookAuthor(reqBook.getBookAuthor());
        //     }
        //     return listedBook;
        // }).collect(Collectors.toList());
    }
}
