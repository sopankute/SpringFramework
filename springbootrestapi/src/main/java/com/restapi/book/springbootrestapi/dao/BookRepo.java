package com.restapi.book.springbootrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.book.springbootrestapi.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

    public Book findById(int id);
}
