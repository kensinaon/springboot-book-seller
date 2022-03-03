package com.sinaon.bookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author ksinaon
 * @Created 2/16/2022 11:23 AM
 */

@Data
@Entity
@Table(name = "users") // don't use "user" it is reserved name on PostgreSQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
