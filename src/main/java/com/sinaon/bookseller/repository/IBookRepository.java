package com.sinaon.bookseller.repository;

import com.sinaon.bookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author ksinaon
 * @Created 2/16/2022 1:24 PM
 */
public interface IBookRepository extends JpaRepository<Book, Long> {
}
