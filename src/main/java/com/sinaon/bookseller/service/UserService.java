package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.Role;
import com.sinaon.bookseller.model.User;
import com.sinaon.bookseller.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @Author ksinaon
 * @Created 2/16/2022 1:47 PM
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public void makeAdmin(String username){
        userRepository.updateUserRole(username, Role.ADMIN);
    }
}
