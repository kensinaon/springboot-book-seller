package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.Book;

import java.util.List;

/**
 * @Author ksinaon
 * @Created 2/16/2022 2:21 PM
 */
public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAlBooks();
}
