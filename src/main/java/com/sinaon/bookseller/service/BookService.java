package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.Book;
import com.sinaon.bookseller.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author ksinaon
 * @Created 2/16/2022 2:21 PM
 */
@Service
public class BookService implements IBookService{

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book saveBook(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id)   ;
    }

    @Override
    public List<Book> findAlBooks(){
        return bookRepository.findAll();
    }
}
