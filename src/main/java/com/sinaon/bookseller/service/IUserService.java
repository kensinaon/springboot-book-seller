package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @Author ksinaon
 * @Created 2/16/2022 1:47 PM
 */
public interface IUserService {
    User saveUser(User user);
    Optional<User> findUserByUsername(String username);
    @Transactional
    void makeAdmin(String username);
}
