package com.sinaon.bookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author ksinaon
 * @Created 2/16/2022 11:51 AM
 */
@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "author", nullable = false, length = 100)
    private String author;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createTime;
}
